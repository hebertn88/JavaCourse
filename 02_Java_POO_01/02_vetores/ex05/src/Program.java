import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        double maior = 0;
        int posicao = 0;
        for (int i=0; i< numeros.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
            if (i==0 || numeros[i] > maior) {
                maior = numeros[i];
                posicao = i;
            }

        }
        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f%n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d%n", posicao);

        sc.close();
    }
}
