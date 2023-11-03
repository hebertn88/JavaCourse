package application;

import services.InputService;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        InputService inputService = new InputService(sc);

        System.out.print("How many students for course A? ");
        int quantityStudents = sc.nextInt();
        Set<Integer> courseA = inputService.processStudentsForCourse(quantityStudents);

        System.out.print("How many students for course B? ");
        quantityStudents = sc.nextInt();
        Set<Integer> courseB = inputService.processStudentsForCourse(quantityStudents);

        System.out.print("How many students for course C? ");
        quantityStudents = sc.nextInt();
        Set<Integer> courseC = inputService.processStudentsForCourse(quantityStudents);

        Set<Integer> total = new HashSet<>(courseA);

        total.addAll(courseB);
        total.addAll(courseC);

        System.out.println("Total students: " + total.size());

        sc.close();
    }
}
