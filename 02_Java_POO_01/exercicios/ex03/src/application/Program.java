package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Informe os dados do Aluno:");
        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();

        System.out.print("Nota 1: ");
        aluno.nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        aluno.nota2 = sc.nextDouble();

        System.out.print("Nota 3: ");
        aluno.nota3 = sc.nextDouble();

        System.out.println();
        System.out.printf("Nota Final: %.2f%n", aluno.notaFinal());

        System.out.println();
        if (aluno.pontosFaltando() > 0.00) {
            System.out.println("Reprovado!");
            System.out.printf("Faltaram %.2f pontos%n", aluno.pontosFaltando());
        } else {
            System.out.println("Aprovado!");
        }

        sc.close();
    }
}
