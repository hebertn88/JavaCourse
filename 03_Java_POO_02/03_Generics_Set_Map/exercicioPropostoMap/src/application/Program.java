package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String entryPath = sc.nextLine();

        File filePath = entryPath.isEmpty() ?
                new File("C:\\Users\\heber\\dev\\javaCourse\\JavaCourse\\03_Java_POO_02\\03_Generics_Set_Map\\exercicioPropostoMap\\in.csv") :
                new File(entryPath);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            Map<String, Integer> votes = new HashMap<>();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");

                String candidate = fields[0];
                Integer count = Integer.parseInt(fields[1]);

                line = br.readLine();

                if (!votes.containsKey(candidate)) {
                    votes.put(candidate, count);
                    continue;
                }

                votes.put(candidate, votes.get(candidate) + count);
            }

            for (String key : votes.keySet()) {
                System.out.printf("%s: %d\n", key, votes.get(key));
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
