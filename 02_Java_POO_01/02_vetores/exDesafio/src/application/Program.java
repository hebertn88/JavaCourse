package application;

import entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos você quer alugar? ");
        int n = sc.nextInt();

        Estudante[] quartos = new Estudante[10];
        for (int i=0; i < n; i++) {
            System.out.printf("Aluguel #%d:%n", i+1);

            int numeroQuarto;
            do {
                //sc.nextLine();
                System.out.print("Quarto: ");
                numeroQuarto = sc.nextInt();

                if (quartoInvalido(numeroQuarto - 1)) {
                    System.out.println("Quarto inválido! Escolha de 1 a 10.");

                } else if (quartoOCupado(quartos, numeroQuarto -1)) {
                    System.out.println("O Quarto já está alugado!");
                }

            } while (quartoOCupado(quartos, numeroQuarto -1));

            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            quartos[numeroQuarto - 1] = new Estudante(nome, email);

        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i=0; i< quartos.length;i++) {
            if (quartoOCupado(quartos, i)) {
                System.out.printf("%d: %s%n", i+1, quartos[i]);
            }
        }
        sc.close();
    }

    public static boolean quartoInvalido(int quarto) {
        return quarto < 0 || quarto > 9;
    }

    public static boolean quartoOCupado(Estudante[] quartos, int quarto) {
        if (quartoInvalido(quarto)) {
            return true;
        }

        return quartos[quarto] != null;
    }

}
