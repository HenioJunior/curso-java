package exercicios._037_estrutura_condicional._3;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Informe o 1º número:");

        a = sc.nextInt();

        System.out.println("Informe o 2º número:");

        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else
            System.out.println("Nao sao Multiplos");

        sc.close();
    }
}
