import java.util.Locale;
import java.util.Scanner;

public class Aula29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // -------------------------------------------

        // EXERCICIO 01 - SOMA DOIS NUMEROS

        // Faça um programa para ler dois valores inteiros,
        // e depois mostrar na tela a soma desses números
        // com uma mensagem explicativa, conforme exemplos.

        System.out.printf("EXERCICIO 01 - SOMA DOIS NUMEROS%n%n");
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.printf("SOMA = %d%n%n", num1 + num2);

        // -------------------------------------------

        // EXERCICIO 02 - RAIO DO CIRCULO

        // Faça um programa para ler o valor do raio de um círculo,
        // e depois mostrar o valor da área deste círculo com quatro
        // casas decimais conforme exemplos.
        //Fórmula da área: area = π . raio2
        //Considere o valor de π = 3.14159

        System.out.printf("EXERCICIO 02 - RAIO DO CIRCULO%n%n");

        double pi = 3.14159;

        System.out.print("Digite o raio de um círculo: ");
        double raio = sc.nextDouble();

        System.out.printf("A = %.4f%n%n", pi * Math.pow(raio, 2));

        // -------------------------------------------

        // EXERCICIO 03 - DIFERENCA = (A * B - C * D)

        // Fazer um programa para ler quatro valores inteiros
        // A, B, C e D. A seguir, calcule e mostre a diferença
        // do produto de A e B pelo produto de C e D segundo
        // a fórmula: DIFERENCA = (A * B - C * D).

        System.out.printf("EXERCICIO 03 - DIFERENCA = (A * B - C * D)%n%n");

        System.out.print("Digite o primeiro número: ");
        int numA = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numB = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numC = sc.nextInt();

        System.out.print("Digite o quarto número: ");
        int numD = sc.nextInt();

        System.out.printf("DIFERENCA = %d%n%n", numA * numB - numC * numD);

        // -------------------------------------------

        // EXERCICIO 04 - CALCULA SALARIO

        // Fazer um programa que leia o número de um funcionário, seu
        // número de horas trabalhadas, o valor que recebe por hor e
        // calcula o salário desse funcionário. A seguir, mostre o número
        // e o salário do funcionário, com duas casas decimais.

        System.out.printf("EXERCICIO 04 - CALCULA SALARIO%n%n");

        System.out.print("Digite o número do funcionário: ");
        int numFunc = sc.nextInt();

        System.out.print("Digite as horas trabalhadas: ");
        int horas = sc.nextInt();

        System.out.print("Digite o valor por hora trabalhada: ");
        double valHora = sc.nextDouble();

        System.out.printf("NUMBER = %d%n", numFunc);
        System.out.printf("SALARY = U$ %.2f%n%n", (double) horas * valHora);

        // -------------------------------------------

        // EXERCICIO 05 - VALOR PECAS

        // Fazer um programa para ler o código de uma peça 1,
        // o número de peças 1, o valor unitário de cada peça 1,
        // o código de uma peça 2, o número de peças 2 e o valor unitário
        // de cada peça 2. Calcule e mostre o valor a ser pago.

        System.out.printf("EXERCICIO 05 - VALOR PECAS%n%n");

        System.out.println("Digite o Código, Quantidade e Valor Unitário da primeira peça:");
        sc.nextInt();
        int qtdP1 = sc.nextInt();
        double valorP1 = sc.nextDouble();
        double totP1 = (double) qtdP1 * valorP1;

        System.out.println("Digite o Código, Quantidade e Valor Unitário da segunda peça:");
        sc.nextInt();
        int qtdP2 = sc.nextInt();
        double valorP2 = sc.nextDouble();
        double totP2 = (double) qtdP2 * valorP2;

        System.out.printf("VALOR A PAGAR = R$ %.2f%n%n", totP1 + totP2);

        // -------------------------------------------

        // EXERCICIO 06 - AREAS

        // Fazer um programa que leia três valores com ponto
        // flutuante de dupla precisão: A, B e C. Em seguida,
        // calcule e mostre:
        // a) a área do triângulo retângulo que tem A por base e C por altura.
        // b) a área do círculo de raio C. (pi = 3.14159)
        // c) a área do trapézio que tem A e B por bases e C por altura.
        // d) a área do quadrado que tem lado B.
        // e) a área do retângulo que tem lados A e B.

        System.out.printf("EXERCICIO 06 - AREAS%n%n");

        System.out.println("Digite 3 números:");
        double valA = sc.nextDouble();
        double valB = sc.nextDouble();
        double valC = sc.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n", valA * valC / 2);
        System.out.printf("CIRCULO: %.3f%n", pi * Math.pow(valC, 2));
        System.out.printf("TRAPEZIO: %.3f%n", (valA + valB) * valC / 2);
        System.out.printf("QUADRADO: %.3f%n", Math.pow(valB, 2));
        System.out.printf("RETANGULO: %.3f%n", valA * valB);

        // -------------------------------------------

        sc.close();
    }
}
