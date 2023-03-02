package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        double menorAltura = 0;
        double maiorAltura = 0;
        int numeroHomens = 0;
        int numeroMulheres = 0;
        double alturaMulheres = 0;

        for (int i = 0; i < pessoas.length; i++) {
            sc.nextLine();

            System.out.printf("Dados da %da pessoa:%n", i+1);

            char genero;
            do {
                System.out.print("Genero (M/F): ");
                genero = sc.nextLine().strip().toUpperCase().charAt(0);

                if (genero != 'M' && genero != 'F') {
                    System.out.println("Genero invalido! Digite novamente.");
                }
            } while (genero != 'M' && genero != 'F');

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(genero, altura);

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (altura < menorAltura || menorAltura == 0) {
                menorAltura = altura;
            }

            if (String.valueOf(genero).equals("F")) {
                alturaMulheres += altura;
                numeroMulheres++;
            }

            if (String.valueOf(genero).equals("M")) {
                numeroHomens++;
            }

        }

        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);

        if (numeroMulheres > 0) {
            double mediaAlturaMulheres = (double) alturaMulheres / numeroMulheres;
            System.out.printf("Media de altura das mulheres = %.2f%n", mediaAlturaMulheres);
        }

        System.out.printf("Numero de homens = %d%n", numeroHomens);

        sc.close();
    }
}
