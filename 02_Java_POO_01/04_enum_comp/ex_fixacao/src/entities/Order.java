package entities;

import entities.enums.OrderStatus;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Instant moment;
    private OrderStatus status;
    private Client client;

    List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(Instant moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total(){
        double sum = 0.0;

        for (OrderItem item : items) {
            sum += item.subTotal();
        }

        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("ORDER SUMMARY:\n");

        sb.append("Order moment: ");
        sb.append(moment.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        sb.append("\n");

        sb.append("Order status: ");
        sb.append(status);
        sb.append("\n");

        sb.append("Client: ");
        sb.append(client);
        sb.append("\n");

        sb.append("Order items:\n");
        for (OrderItem item : items) {
            sb.append(item).append("\n");
        }

        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        sb.append("\n");

        return sb.toString();

    }
}
