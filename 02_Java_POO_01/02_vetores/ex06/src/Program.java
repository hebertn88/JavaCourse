import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores terá cada vetor? ");
        int n = sc.nextInt();

        int[] vetA = new int[n];
        int[] vetB = new int[n];
        int[] vetSoma = new int[n];

        sc.nextLine();
        System.out.println("Digite os valores do Vetor A:");
        for (int i = 0; i < vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do Vetor B:");
        for (int i = 0; i < vetB.length; i++) {
            vetB[i] = sc.nextInt();

            vetSoma[i] = vetA[i] + vetB[i];
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < vetSoma.length; i++) {
            System.out.println(vetSoma[i]);
        }

        sc.close();

    }
}
