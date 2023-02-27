package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        double somaAltura = 0;
        int menoresIdade = 0;

        for (int i=0; i<pessoas.length; i++) {
            sc.nextLine();

            System.out.printf("Dados da %da pessoa:%n", i+1);

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            sc.nextLine();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);

            somaAltura += pessoas[i].getAltura();

            if (pessoas[i].getIdade() < 16) {
                menoresIdade++;
            }
        }

        System.out.println();
        System.out.printf("Altura Média: %.2f%n", somaAltura / pessoas.length);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", (double) menoresIdade / pessoas.length * 100);

        for (int i=0;i< pessoas.length;i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }

        sc.close();
    }
}
