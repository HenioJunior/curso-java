package _04_estrutura_sequencial._030_exercicios._4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTRADA:");
        int number = sc.nextInt();
        int hour = sc.nextInt();
        double valuePerHour = sc.nextDouble();

        double salary = hour * valuePerHour;

        System.out.println("SAIDA:");
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = US$ %.2f", salary);

        sc.close();
    }
}
