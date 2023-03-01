package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        Aluno[] alunos = new Aluno[n];

        for (int i = 0; i < alunos.length; i++) {
            sc.nextLine();
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno%n", i+1);
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();

            alunos[i] = new Aluno(nome, nota1, nota2);
        }

        System.out.println("ALUNOS APROVADOS:");
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].aprovado(6.0)) {
                System.out.println(alunos[i].getNome());
            }
        }

        sc.close();
    }
}
