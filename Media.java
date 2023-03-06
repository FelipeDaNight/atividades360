import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[15];
        double[] pr1 = new double[15];
        double[] pr2 = new double[15];
        double[] media = new double[15];
        String[] situacao = new String[15];
        int i;

        
        for (i = 0; i < 15; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = input.nextLine();
            System.out.print("Nota da PR1 do aluno " + (i + 1) + ": ");
            pr1[i] = input.nextDouble();
            System.out.print("Nota da PR2 do aluno " + (i + 1) + ": ");
            pr2[i] = input.nextDouble();
            input.nextLine(); 
            media[i] = Math.round((pr1[i] + pr2[i]) / 2);
            if (media[i] >= 60) {
                situacao[i] = "AP";
            } else {
                situacao[i] = "RP";
            }
        }

       
        System.out.println("\nLista de alunos:");
        System.out.println("Nome\tPR1\tPR2\tMédia\tSituação");
        for (i = 0; i < 15; i++) {
            System.out.println(nomes[i] + "\t" + pr1[i] + "\t" + pr2[i] + "\t" + media[i] + "\t" + situacao[i]);
        }
    }
}
