import java.util.Locale;
import java.util.Scanner;

public class aula48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.printf("EXERCÍCIOS ESTRUTURA REPETITIVA WHILE%n%n");
        System.out.println("Digite uma das opções a seguir:");
        System.out.println("1 - Senha");
        System.out.println("2 - Quadrante");
        System.out.println("3 - Combustivel");

        System.out.printf("Faça sua escolha [1-3]: ");
        switch (sc.nextInt()) {
            case 1:
                System.out.printf("%nEXERCÍCIO 1%n%n");

                System.out.printf("Digite a senha: ");
                int num1 = sc.nextInt();
                while (num1 != 2002) {
                    System.out.println("SENHA INVÁLIDA!");
                    System.out.printf("Digite a senha: ");
                    num1 = sc.nextInt();
                }
                System.out.println("ACESSO PERMITIDO!");
            break;
            case 2:
                System.out.printf("%nEXERCÍCIO 2%n%n");

                int num2A = -987654321;
                int num2B = -987654321;

                while (num2A != 0 && num2B != 0) {
                    System.out.printf("Digite as cordenadas: ");
                    num2A = sc.nextInt();
                    num2B = sc.nextInt();

                    if (num2A > 0 && num2B > 0) {
                        System.out.println("PRIMEIRO");
                    } else if (num2A < 0  && num2B > 0) {
                        System.out.println("SEGUNDO");
                    } else if (num2A < 0  && num2B < 0) {
                        System.out.println("TERCEIRO");
                    } else if (num2A > 0  && num2B < 0) {
                        System.out.println("QUARTO");
                    }

                }
            break;
            case 3:
                System.out.printf("%nEXERCÍCIO 3%n%n");

                int alcool = 0;
                int diesel = 0;
                int gasolina = 0;

                int cod = 0;
                while (cod != 4) {
                    System.out.printf("Digite o Código do produto [1-4]: ");
                    cod = sc.nextInt();
                    switch (cod) {
                        case 1:
                            System.out.println("PREFERENCIA: ALCOOL");
                            alcool++;
                            break;
                        case 2:
                            System.out.println("PREFERENCIA: GASOLINA");
                            gasolina++;
                            break;
                        case 3:
                            System.out.println("PREFERENCIA: DIESEL");
                            diesel++;
                            break;
                        case 4:
                            System.out.println("FIM");
                            break;
                        default:
                            System.out.println("CODIGO INVALIDO");

                    }
                }
                System.out.printf("%nMUITO OBRIGADO!%n");
                System.out.printf("ALCOOL: %d%n", alcool);
                System.out.printf("GASOLINA: %d%n", gasolina);
                System.out.printf("DIESEL: %d%n", diesel);

            break;
            default:
                System.out.println("Opção inválida!");
            break;
        }
        System.out.printf("%nFIM DO PROGRAMA");
        sc.close();
    }
}
