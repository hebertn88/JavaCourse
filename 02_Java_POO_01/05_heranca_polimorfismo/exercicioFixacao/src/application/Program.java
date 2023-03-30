package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Product> productList = new ArrayList<>();
        for (int i=0; i<n; i++) {
            System.out.printf("Product #%d data:%n", i+1);

            System.out.print("Common, used or imported (c/u/i)? ");
            String productType = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            if (productType.charAt(0) == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                sc.nextLine();

                productList.add(new ImportedProduct(name, price, customsFee));

            } else if (productType.charAt(0) == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                productList.add(new UsedProduct(name, price, manufactureDate));

            } else {
                productList.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS");

        for (Product product : productList) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
