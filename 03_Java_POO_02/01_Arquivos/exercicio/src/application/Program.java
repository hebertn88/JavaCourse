package application;

import application.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        File filePath = new File("C:\\Users\\heber\\dev\\javaCourse\\JavaCourse\\03_Java_POO_02\\01_Arquivos\\exercicio\\in.csv");
        List<Product> products = new ArrayList<>();

        // read file
        System.out.println("Reading Input File...");
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            while (line != null) {
                String[] productCSV = line.split(",");
                Product product = new Product(
                        productCSV[0],
                        Double.parseDouble(productCSV[1]),
                        Integer.parseInt(productCSV[2]));
                products.add(product);
                line = br.readLine();

                System.out.println(product);
            }

            // write file
            System.out.println();

            File outputFile = new File(filePath.getParent() + "\\out\\summary.csv");
            System.out.println("Writing Output File...");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
                for (Product product : products) {
                    System.out.println(product.getName() + "," + String.format("%.2f", product.getTotalValue()));
                    bw.write(product.getName() + "," + String.format("%.2f", product.getTotalValue()));
                    bw.newLine();
                }

                System.out.println();
                System.out.println("File exported successfully!");
                System.out.println(outputFile.getAbsolutePath());
            }
            catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
