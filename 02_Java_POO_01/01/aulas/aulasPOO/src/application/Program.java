package application;

import entities.Triangle;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle triangleX, triangleY;
        triangleX = new Triangle();
        triangleY = new Triangle();

        System.out.println("Informe as medidas do triangulo X: ");
        triangleX.a = sc.nextDouble();
        triangleX.b = sc.nextDouble();
        triangleX.c = sc.nextDouble();

        System.out.println("Informe as medidas do triangulo Y: ");
        triangleY.a = sc.nextDouble();
        triangleY.b = sc.nextDouble();
        triangleY.c = sc.nextDouble();

        double areaX = triangleX.area();
        double areaY = triangleY.area();

        System.out.printf("Area do triangulo X: %.4f%n", areaX);
        System.out.printf("Area do triangulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior area: X");
        } else {
            System.out.println("Maior area: Y");
        }

        sc.close();
    }
}
