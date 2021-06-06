package _04_estrutura_sequencial._030_exercicios._2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTRADA:");
        double raio = sc.nextDouble();

        System.out.println("SAIDA:");
        System.out.printf("A=%.4f",area(raio));

        sc.close();
    }

    public static double area(double raio) {
        double PI = 3.14159;
        return PI * Math.pow(raio, 2);
   }
}
