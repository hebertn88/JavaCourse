package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Informe os dados do Produto");

        System.out.print("Nome: ");
        product.name = sc.nextLine();

        System.out.print("Preço: ");
        product.price = sc.nextDouble();

        System.out.print("Quantidade em Estoque: ");
        product.quantity = sc.nextInt();

        System.out.printf("%nDados do Produto: %s%n%n", product);

        System.out.printf("Informe a quantidade de produtos a serem adicionados ao estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.printf("%nDados atualizados: %s%n%n", product);

        System.out.printf("Informe a quantidade de produtos a serem removidos do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.printf("%nDados atualizados: %s%n", product);

        sc.close();
    }
}
