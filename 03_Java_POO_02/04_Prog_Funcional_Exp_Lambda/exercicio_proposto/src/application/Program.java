package application;

import entities.Employee;

import java.io.*;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String entryPath = sc.nextLine();

        File filePath = entryPath.isEmpty() ?
                new File("C:\\Users\\heber\\dev\\javaCourse\\JavaCourse\\03_Java_POO_02\\04_Prog_Funcional_Exp_Lambda\\exercicio_proposto\\in.csv") :
                new File(entryPath);

        System.out.print("\"Enter salary: ");
        Double salary = sc.nextDouble();

        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.printf("Email of people whose salary is more than %.2f:\n", salary);

            List<String> emails = employees.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(Employee::getEmail)
                    // .sorted((str1, str2) -> str1.toUpperCase().compareTo(str2.toUpperCase()))
                    .sorted(Comparator.comparing(String::toUpperCase))
                    .toList();

            emails.forEach(System.out::println);

            Double sum = employees.stream()
                    .filter(e -> e.getName().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.printf("Sum of salary of people whose name starts with 'M': %.2f\n", sum);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
