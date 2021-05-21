package exercicios._030._3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTRADA:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int diferenca = a*b-c*d;

        System.out.println("SAIDA:");
        System.out.println("DIFERENÇA = " + diferenca);

        sc.close();
    }
}
