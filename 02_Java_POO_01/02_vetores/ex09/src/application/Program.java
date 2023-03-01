package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        int posicaoMaisVelho = 0;
        for (int i = 0; i < pessoas.length; i++) {
            sc.nextLine();

            System.out.printf("Dados da %da pessoa:%n", i+1);

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            pessoas[i] = new Pessoa(nome, idade);

            if (idade > pessoas[posicaoMaisVelho].getIdade()) {
                posicaoMaisVelho = i;
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s%n", pessoas[posicaoMaisVelho].getNome());

        sc.close();
    }
}
