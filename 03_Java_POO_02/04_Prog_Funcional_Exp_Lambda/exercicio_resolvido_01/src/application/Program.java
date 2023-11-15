package application;

import models.Product;

import java.io.*;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String entryPath = sc.nextLine();

        File filePath = entryPath.isEmpty() ?
                new File("C:\\Users\\heber\\dev\\javaCourse\\JavaCourse\\03_Java_POO_02\\04_Prog_Funcional_Exp_Lambda\\exercicio_resolvido_01\\in.csv") :
                new File(entryPath);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));

                line = br.readLine();
            }

            Double avg = list.stream().map(Product::getPrice).reduce(0.0, Double::sum) / list.size();

            // Comparator<String> comp = (str1, str2) -> str1.toUpperCase().compareTo(str2.toUpperCase());
            Comparator<String> comp = Comparator.comparing(String::toUpperCase);

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(Product::getName)
                    .sorted(comp.reversed())
                    .toList();

            System.out.printf("Average price: %.2f\n", avg);
            names.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
