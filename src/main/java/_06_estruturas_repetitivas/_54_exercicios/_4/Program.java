package _06_estruturas_repetitivas._54_exercicios._4;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double div = 0;
        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b == 0) {
                System.out.println("Divisão impossível");
            }else {
                div = (double)a / b;
                System.out.printf("%.1f%n", div);
            }
        }
        sc.close();
    }
}
