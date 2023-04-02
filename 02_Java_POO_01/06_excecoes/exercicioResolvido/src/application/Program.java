package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkin = LocalDate.parse(sc.nextLine(), dateFormatter);

            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkout = LocalDate.parse(sc.nextLine(), dateFormatter);

            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println("Reservation: " + reservation);

            System.out.println();

            System.out.println("Enter data to update the reservation:");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkin = LocalDate.parse(sc.nextLine(), dateFormatter);

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkout = LocalDate.parse(sc.nextLine(), dateFormatter);

            reservation.updateDates(checkin, checkout);
            System.out.println(reservation);

        }
        catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Input error: Invalid value");
        }
        catch (DateTimeParseException e) {
            System.out.println("Input error: Invalid Date Format");
        }

        sc.close();
    }
}
