package _05_estrutura_condicional._37_exercicios._5;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double total;

        System.out.println("Entre com o código");
        codigo = sc.nextInt();

        System.out.println(" Entre com a quantidade");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            total = 4.00 * quantidade;
        } else if (codigo == 2) {
            total = 4.50 * quantidade;

        } else if (codigo == 3) {
            total = 5.00 * quantidade;

        } else if (codigo == 4) {
            total = 2.00 * quantidade;

        } else
            total = 1.50 * quantidade;

        System.out.printf("Total a pagar: R$ %.2f", total);

        sc.close();
    }
}
