package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Department
        System.out.print("Enter Department's name: ");
        String department = sc.nextLine();


        // Worker
        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        String level = sc.nextLine();

        System.out.print("Base salary: ");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));

        // Worker Contracts
        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            sc.nextLine();
            System.out.printf("Enter contract #%d data:%n", i+1);

            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            worker.addContract(new HourContract(date, valuePerHour, hours));
        }

        sc.nextLine();
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthYear = sc.nextLine();
        int month = Integer.parseInt(monthYear.substring(0,2));
        int year = Integer.parseInt(monthYear.substring(3));


        System.out.printf("Name: %s%n", worker.getName());
        System.out.printf("Department: %s%n", worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f%n", monthYear, worker.income(year, month));

        sc.close();
    }
}
