import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];
        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();

            soma += numeros[i];
        }

        double media = soma / numeros.length;

        System.out.println();
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < media) {
                System.out.println(numeros[i]);
            }
        }


        sc.close();
    }
}
