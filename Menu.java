import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;


        while (true) {
            System.out.println("MENU");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("OPCAO: ");

            int opcao = input.nextInt();
            input.nextLine(); // Consumir o \n deixado pelo nextInt()

            if (opcao == 4) {
                System.out.println("Algoritmo terminado.");
                break;
            }

            System.out.print("Digite a frase: ");
            frase = input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Comprimento da frase: " + frase.length());
                    break;
                case 2:
                    if (frase.length() < 4) {
                        System.out.println("A frase deve ter pelo menos 4 caracteres.");
                    } else {
                        String dois_primeiros = frase.substring(0, 2);
                        String dois_ultimos = frase.substring(frase.length() - 2);
                        System.out.println("Dois primeiros caracteres: " + dois_primeiros);
                        System.out.println("Dois últimos caracteres: " + dois_ultimos);
                    }
                    break;
                case 3:
                    String frase_espelhada = new StringBuilder(frase).reverse().toString();
                    System.out.println("Frase espelhada: " + frase_espelhada);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println(); // Linha em branco para separar as execuções do menu
        }
    }
}
