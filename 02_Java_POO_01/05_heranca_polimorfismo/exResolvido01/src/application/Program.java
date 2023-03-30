package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();
        for (int i=0; i<n; i++) {
            sc.nextLine();
            System.out.printf("Employee #%d data%n", i+1);

            System.out.print("Outsourced (y/n)? ");
            String isOutsourced = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (isOutsourced.equalsIgnoreCase("y")) {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        sc.close();
    }
}
