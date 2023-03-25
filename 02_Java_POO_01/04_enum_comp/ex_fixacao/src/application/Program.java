package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // client
        System.out.println("Enter cliente data:");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Client client = new Client(name, email, birthDate);

        // Order
        System.out.println("Enter order data:");

        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        Order order  = new Order(Instant.now(), status, client);

        // Order Item
        for (int i=0; i<n; i++) {
            sc.nextLine();
            System.out.printf("Enter #%d item data:\n", i+1);

            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(productQuantity, productPrice  , product);

            order.addItem(item);
        }

        System.out.println();
        System.out.println(order);


        sc.close();
    }

}
