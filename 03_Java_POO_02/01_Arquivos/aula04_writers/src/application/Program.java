package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};

        String path = "C:\\Users\\heber\\dev\\javaCourse\\JavaCourse\\03_Java_POO_02\\01_Arquivos\\meuArquivo\\aula04.txt";

        try (BufferedWriter br = new BufferedWriter(new FileWriter(path))) {
            for(String line : lines) {
                br.write(line);
                br.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
