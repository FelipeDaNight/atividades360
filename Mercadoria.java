import java.util.Scanner;

public class Mercadoria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtdLucroMenor10 = 0;
        int qtdLucroEntre10e20 = 0;
        int qtdLucroMaior20 = 0;
        double precoCompra, precoVenda, lucro;
        int i;

        for (i = 0; i < 100; i++) {
            System.out.print("Preço de compra da mercadoria " + (i + 1) + ": ");
            precoCompra = input.nextDouble();
            System.out.print("Preço de venda da mercadoria " + (i + 1) + ": ");
            precoVenda = input.nextDouble();
            input.nextLine(); 
            lucro = (precoVenda - precoCompra) / precoCompra * 100;
            if (lucro < 10) {
                qtdLucroMenor10++;
            } else if (lucro <= 20) {
                qtdLucroEntre10e20++;
            } else {
                qtdLucroMaior20++;
            }
        }

        System.out.println("\nResultado:");
        System.out.println("Lucro < 10%: " + qtdLucroMenor10);
        System.out.println("10% <= Lucro <= 20%: " + qtdLucroEntre10e20);
        System.out.println("Lucro > 20%: " + qtdLucroMaior20);
    }
}
