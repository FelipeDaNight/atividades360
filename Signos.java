import java.util.Scanner;

public class Signos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia, mes;
        String signo;
        
        while (true) {
            System.out.print("Digite o dia de nascimento (DD) ou 9999 para sair: ");
            dia = input.nextInt();
            if (dia == 9999) {
                break;
            }
            System.out.print("Digite o mês de nascimento (MM): ");
            mes = input.nextInt();

            if (mes == 1 && dia <= 20 || mes == 12 && dia >= 22) {
                signo = "Capricórnio";
            } else if (mes == 2 && dia <= 19 || mes == 1 && dia >= 21) {
                signo = "Aquário";
            } else if (mes == 3 && dia <= 20 || mes == 2 && dia >= 20) {
                signo = "Peixes";
            } else if (mes == 4 && dia <= 20 || mes == 3 && dia >= 21) {
                signo = "Áries";
            } else if (mes == 5 && dia <= 20 || mes == 4 && dia >= 21) {
                signo = "Touro";
            } else if (mes == 6 && dia <= 20 || mes == 5 && dia >= 21) {
                signo = "Gêmeos";
            } else if (mes == 7 && dia <= 21 || mes == 6 && dia >= 21) {
                signo = "Câncer";
            } else if (mes == 8 && dia <= 22 || mes == 7 && dia >= 22) {
                signo = "Leão";
            } else if (mes == 9 && dia <= 22 || mes == 8 && dia >= 23) {
                signo = "Virgem";
            } else if (mes == 10 && dia <= 22 || mes == 9 && dia >= 23) {
                signo = "Libra";
            } else if (mes == 11 && dia <= 21 || mes == 10 && dia >= 23) {
                signo = "Escorpião";
            } else {
                signo = "Sagitário";
            }

            System.out.println("Seu signo é " + signo);
        }
    }
}
