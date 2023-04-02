package model.entities;

import model.exceptions.DomainException;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private final static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) throws DomainException{
        validateDates(checkin, checkout);
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public long duration(){
        return Duration.between(checkin.atStartOfDay(), checkout.atStartOfDay()).toDays();
    }

    public void updateDates(LocalDate checkin, LocalDate checkout) throws DomainException{
        validateDates(checkin, checkout);
        this.checkin = checkin;
        this.checkout = checkout;
    }

    private void validateDates(LocalDate checkin, LocalDate checkout) throws DomainException{
        if (checkin.isBefore(LocalDate.now()) || checkout.isBefore(LocalDate.now())) {
            throw new DomainException("Reservation dates for update must be future dates");
        }

        if (checkin.isAfter(checkin)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Room %d, check-in: %s, check-out: %s, %d nights",
                roomNumber,
                dateFormatter.format(checkin),
                dateFormatter.format(checkout),
                duration()
        );
    }
}
