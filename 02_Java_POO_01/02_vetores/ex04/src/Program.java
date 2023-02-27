import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i=0; i< numeros.length; i++) {
            sc.nextLine();
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("NÚMEROS PARES:");

        int qtdNumerosPares = 0;
        for (int i=0; i< numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.printf("%d ", numeros[i]);
                qtdNumerosPares++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.printf("QUANTIDADE DE PARES = %d%n", qtdNumerosPares);

        sc.close();
    }
}
