package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Informe o número da conta: ");
        int number = sc.nextInt();

        System.out.print("Informe o Titular da conta: ");
        sc.nextLine();
        String holder = sc.nextLine();

        String resp;
        do {
            System.out.print("Deseja realizar um depósito inicial (S/N)? ");
            resp = sc.next().strip().toUpperCase();

            if (!resp.equals("S") && !resp.equals("N")) {
                System.out.println("Resposta inválida!");
            }
        } while (!resp.equals("S") && !resp.equals("N"));

        if (resp.equals("S")) {
            System.out.print("Informe o valor do depósito inicial: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.println();

        System.out.println("Dados da Conta:");
        System.out.println(account);

        System.out.println();

        System.out.print("Informe o valor do depósito: ");
        double amount = sc.nextDouble();
        account.deposit(amount);

        System.out.println("Dados atualizados da conta:");
        System.out.println(account);

        System.out.println();

        System.out.print("Informe o valor do saque: ");
        amount = sc.nextDouble();
        account.withdraw(amount);

        System.out.println("Dados atualizados da conta:");
        System.out.println(account);

        sc.close();
    }
}
