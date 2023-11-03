package application;

import entities.LogEntry;

import java.io.*;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String entryPath = sc.nextLine();

        File filePath = entryPath.isEmpty() ?
                new File("C:\\Users\\heber\\dev\\javaCourse\\JavaCourse\\03_Java_POO_02\\03_Generics_Set_Map\\exercicioResolvidoSet\\in.txt") :
                new File(entryPath);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            Set<LogEntry> logEntries = new HashSet<>();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(" ");
                logEntries.add(new LogEntry(fields[0], Date.from(Instant.parse(fields[1])) ));
                line = br.readLine();
            }

            System.out.println("Total users: " + logEntries.size());
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
