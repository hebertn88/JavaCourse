package application;

import java.io.File;

public class Program {
    public static void main(String[] args) {
        File path = new File("C:\\Users\\heber\\dev\\javaCourse\\JavaCourse\\03_Java_POO_02\\01_Arquivos\\meuArquivo");

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println();
        System.out.println("Files:");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(path.getAbsolutePath() + "\\pastaCriadaNoJava").mkdir();
        System.out.println("Directory created successfully: " + success);


        System.out.println();

        File intxt = new File(path.getAbsolutePath() + "\\in.txt");
        System.out.println("File:");
        System.out.println("File Exists: " + intxt.exists());
        System.out.println("Get Name: " + intxt.getName());
        System.out.println("Get Path: " + intxt.getPath());
        System.out.println("Get Parent: " + intxt.getParent());
        System.out.println("is File: " + intxt.isFile());
        System.out.println("is File: " + intxt.isDirectory());

        System.out.println();

        System.out.println("Directory:");
        System.out.println("Directory Exists: " + path.exists());
        System.out.println("Get Name: " + path.getName());
        System.out.println("Get Path: " + path.getPath());
        System.out.println("Get Parent: " + path.getParent());
        System.out.println("is File: " + path.isFile());
        System.out.println("is File: " + path.isDirectory());


        System.out.println();
        File dirInexist = new File(path.getAbsolutePath() + "\\inexist");
        System.out.println("Directory:");
        System.out.println("Directory Exists: " + dirInexist.exists());
        System.out.println("Get Name: " + dirInexist.getName());
        System.out.println("Get Path: " + dirInexist.getPath());
        System.out.println("Get Parent: " + dirInexist.getParent());
        System.out.println("is File: " + dirInexist.isFile());
        System.out.println("is File: " + dirInexist.isDirectory());
    }
}
