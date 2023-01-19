import java.util.Locale;
import java.util.Scanner;

public class aula36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.printf("EXERCÍCIOS ESTRUTURA CONDICIONAL%n%n");
        System.out.println("Digite uma das opções a seguir:");
        System.out.println("1 - Negativo ou Não Negativo");
        System.out.println("2 - Par ou Ímpar");
        System.out.println("3 - Multiplos");
        System.out.println("4 - Duração do Jogo");
        System.out.println("5 - Preço do Lanche");
        System.out.println("6 - Intervalos de 25");
        System.out.println("7 - Quadrante");
        System.out.println("8 - Calcula Imposto");

        System.out.printf("Faça sua escolha [1-8]: ");
        switch (sc.nextInt()) {
        case 1:
            System.out.printf("%nEXERCÍCIO 1%n%n");
            System.out.printf("Digite um número: ");
            double num = sc.nextDouble();
            if (num >= 0) {
                System.out.println("NÃO NEGATIVO");
            } else {
                System.out.println("NEGATIVO");
            }
        break;
        case 2:
            System.out.printf("%nEXERCÍCIO 2%n%n");
            System.out.printf("Digite um número: ");
            double num2 = sc.nextDouble();
            if (num2 % 2 == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("ÍMPAR");
            }
        break;
        case 3:
            System.out.printf("%nEXERCÍCIO 3%n%n");

            System.out.printf("Digite um número: ");
            double num3A = sc.nextDouble();

            System.out.printf("Digite outro número: ");
            double num3B = sc.nextDouble();

            if (num3A % num3B == 0 || num3B % num3A == 0) {
                System.out.println("SÃO MULTIPLOS");
            } else {
                System.out.println("NÃO SÃO MULTIPLOS");
            }
        break;
        case 4:
            System.out.printf("%nEXERCÍCIO 4%n%n");

            System.out.printf("Digite a hora inicial: ");
            int num4A = sc.nextInt();

            System.out.printf("Digite a hora final: ");
            int num4B = sc.nextInt();

            if (num4A < num4B) {
                System.out.printf("O JOGO DUROU %d HORA(S)", num4B - num4A);
            } else {
                System.out.printf("O JOGO DUROU %d HORA(S)", 24 - num4A + num4B);
            }
        break;
        case 5:
            System.out.printf("%nEXERCÍCIO 5%n%n");

            System.out.printf("Digite o Código e Quantidade do Item: ");
            int num5A = sc.nextInt();
            int num5B = sc.nextInt();
            switch (num5A) {
            case 1:
                System.out.printf("TOTAL: R$ %.2f", num5B * 4.0);
            break;
            case 2:
                System.out.printf("TOTAL: R$ %.2f", num5B * 4.5);
            break;
            case 3:
                System.out.printf("TOTAL: R$ %.2f", num5B * 5.0);
            break;
            case 4:
                System.out.printf("TOTAL: R$ %.2f", num5B * 2.0);
            break;
            case 5:
                System.out.printf("TOTAL: R$ %.2f", num5B * 1.5);
            break;
            default:
                System.out.println("CÓDIGO INEXISTENTE!");
            break;
            }
        break;
        case 6:
            System.out.printf("%nEXERCÍCIO 6%n%n");

            System.out.printf("Digite um número: ");
            double num6 = sc.nextDouble();
            if (num6 < 0 || num6 > 100) {
                System.out.println("FORA DO INTERVALO");
            } else {
                String res;
                if (num6 <= 25) {
                    res = "0,25";
                } else if (num6 <= 50) {
                    res = "25,50";
                } else if (num6 <= 75) {
                    res = "50,75";
                } else {
                    res = "75,100";
                }
                System.out.printf("INTERVALO (%s)%n", res);
            }
        break;
        case 7:
            System.out.printf("%nEXERCÍCIO 7%n%n");

            System.out.printf("Digite dois números: ");
            double num7X = sc.nextDouble();
            double num7Y = sc.nextDouble();

            if (num7X == 0 && num7Y == 0) {
                System.out.println("ORIGEM");
            } else if (num7X == 0) {
                System.out.println("EIXO X");
            } else if (num7Y == 0) {
                System.out.println("EIXO Y");
            } else if (num7X > 0 && num7Y > 0) {
                System.out.println("Q1");
            } else if (num7X > 0 && num7Y < 0){
                System.out.println("Q4");
            } else if (num7X < 0 && num7Y > 0) {
                System.out.println("Q2");
            } else {
                System.out.println("Q3");
            }
            break;
        case 8:
            System.out.printf("%nEXERCÍCIO 8%n%n");

            System.out.printf("Informe o valor do Salário: ");
            double salario = sc.nextDouble();

            double imposto = 0;
            if (salario > 4500) {
                imposto += (salario - 4500) * 0.28;
                salario = 4500;
            }
            if (salario > 3000) {
                imposto += (salario - 3000) * 0.18;
                salario = 3000;
            }
            if (salario > 2000) {
                imposto += (salario - 2000) * 0.08;
            }

            if (imposto > 0) {
                System.out.printf("R$ %.2f", imposto);
            } else {
                System.out.println("ISENTO");
            }
        break;
        default:
            System.out.println("Opção inválida!");
        break;
        }

        sc.close();
    }
}
