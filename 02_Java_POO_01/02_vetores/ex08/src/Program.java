import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        int soma = 0;
        int qtdPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            sc.nextLine();

            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                soma += numeros[i];
                qtdPares++;
            }
        }

        if (qtdPares > 0) {
            double media = (double) soma / qtdPares;
            System.out.printf("MEDIA DOS PARES = %.1f%n", media);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}
