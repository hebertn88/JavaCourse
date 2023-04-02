package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");

            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdramLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdramLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            account.withdraw(sc.nextDouble());
            System.out.printf("New balance: $ %.2f%n", account.getBalance());
        }
        catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Input error: Invalid value");
        }

        sc.close();
    }
}
