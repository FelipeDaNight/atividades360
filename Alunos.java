import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] nomes = new String[5];
        double[] notas1 = new double[5];
        double[] notas2 = new double[5];
        double[] medias = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do " + (i+1) + "º aluno: ");
            nomes[i] = sc.nextLine();

            System.out.print("Digite a primeira nota do " + (i+1) + "º aluno: ");
            notas1[i] = sc.nextDouble();

            System.out.print("Digite a segunda nota do " + (i+1) + "º aluno: ");
            notas2[i] = sc.nextDouble();

            medias[i] = (notas1[i] + notas2[i]) / 2;

            sc.nextLine();
        }
        
        sc.close();

        System.out.println("\n\n\n\t\t\t\tRELACAO FINAL\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno: " + nomes[i]);
            System.out.println("Nota 1: " + notas1[i]);
            System.out.println("Nota 2: " + notas2[i]);
            System.out.println("Média: " + medias[i]);
            System.out.println();
        }
    }
}

