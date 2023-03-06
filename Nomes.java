import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[5];

        // Preenchendo o vetor com os nomes
        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = input.nextLine();
        }

        // Imprimindo o nome escolhido pelo usuário
        System.out.print("Digite o número correspondente à pessoa (1 a 5): ");
        int escolha = input.nextInt();
        input.nextLine(); // Consumir o \n deixado pelo nextInt()

        if (escolha < 1 || escolha > 5) {
            System.out.println("Número inválido.");
        } else {
            String nome_escolhido = nomes[escolha - 1];
            System.out.println("Nome escolhido: " + nome_escolhido);
        }
    }
}
