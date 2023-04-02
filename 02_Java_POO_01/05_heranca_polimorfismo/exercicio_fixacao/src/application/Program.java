package application;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Contribuinte> contribuintes = new ArrayList<>();
        for (int i=0; i<n; i++) {
            System.out.printf("Tax payer #%d data:%n", i+1);

            System.out.print("Individual or company (i/c)? ");
            char tipoContribuinte = sc.nextLine().charAt(0);

            System.out.print("Name: ");
            String nome = sc.nextLine();

            System.out.print("Anual income:  ");
            double rendaAnual = sc.nextDouble();
            sc.nextLine();

            if (tipoContribuinte == 'i') {
                System.out.print("Health expenditures: ");
                double gastosSaude = sc.nextDouble();

                contribuintes.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            } else {
                System.out.print("Number of employees: ");
                int numeroFuncionarios = sc.nextInt();

                contribuintes.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
            }
            sc.nextLine();
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        double soma = 0;
        for (Contribuinte c : contribuintes) {
            System.out.println(c);
            soma += c.imposto();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f%n", soma);

        sc.close();
    }
}
