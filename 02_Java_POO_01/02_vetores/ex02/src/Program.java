import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] numbers = new double[n];

        for (int i=0; i< numbers.length; i++) {
            sc.nextLine();
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextDouble();
        }

        System.out.println();

        double sum = 0;

        System.out.print("VALORES =");
        for (int i=0; i<numbers.length; i++) {
            System.out.print(" " + numbers[i]);
            sum += numbers[i];
        }
        System.out.println();

        System.out.printf("SOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f%n", sum / numbers.length);



        sc.close();
    }
}
