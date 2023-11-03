package services;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InputService {

    private static Scanner sc;

    public InputService(Scanner sc) {
        InputService.sc = sc;
    }

    public Set<Integer> processStudentsForCourse(Integer quantity) {
        Set<Integer> students = new HashSet<>();
        while (students.size() < quantity) {
            students.add(sc.nextInt());
        }
        return students;
    }
}
