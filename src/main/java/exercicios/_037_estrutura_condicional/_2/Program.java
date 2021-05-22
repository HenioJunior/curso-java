package exercicios._037_estrutura_condicional._2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número:");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("PAR");
        } else
            System.out.println("IMPAR");

        sc.close();
    }
}
