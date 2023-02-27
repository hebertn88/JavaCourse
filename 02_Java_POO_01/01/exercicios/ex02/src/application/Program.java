package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Nome: ");
        employee.name = sc.nextLine();

        System.out.print("Salario Bruto: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Imposto: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.printf("Employee: %s%n", employee);

        System.out.println();
        System.out.print("Qual a porcentagem de aumento salarial? ");

        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.printf("Employee: %s%n", employee);

        sc.close();
    }
}
