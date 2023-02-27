package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o preço do Dolar: ");
        double dollarPrice = sc.nextDouble();

        System.out.print("Qual a quantia de Dolares a ser comprada? ");
        double dollarConverter = sc.nextDouble();

        System.out.printf("Quantia a ser paga em Reais = %.2f%n", CurrencyConverter.currencyConverter(dollarPrice, dollarConverter));

        sc.close();
    }
}
