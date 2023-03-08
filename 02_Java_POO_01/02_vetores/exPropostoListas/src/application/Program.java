package application;

import entities.Funcionario;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionarios serão registrados? ");
        int n = sc.nextInt();

        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i=0; i<n; i++) {
            sc.nextLine();

            System.out.printf("Funcionario #%d:%n", i+1);
            System.out.print("Id: ");
            Integer id = sc.nextInt();

            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            funcionarios.add(new Funcionario(id, nome, salario));

        }

        System.out.println();
        System.out.print("Informe o Id do funcionario que receberá aumento salarial: ");
        Integer id = sc.nextInt();

        Integer pos = null;
        for (int i=0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getId().equals(id)) {
                pos = i;
            }
        }

        sc.nextLine();
        if (pos != null) {
            System.out.print("Informe a porcentagem: ");
            Double porcentagem = sc.nextDouble();
            funcionarios.get(pos).aumentaSalario(porcentagem);
        } else {
            System.out.println("Este Id não existe!");
        }

        System.out.println();
        System.out.println("Lista de Funcionarios:");
        for (Funcionario f : funcionarios ) {
            System.out.println(f);
        }
        sc.close();
    }
}
