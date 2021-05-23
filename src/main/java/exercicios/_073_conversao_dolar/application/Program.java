package exercicios._073_conversao_dolar.application;

import exercicios._073_conversao_dolar.util.CurrencyConverter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        double amount = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter(dollarPrice, amount));

        sc.close();
    }
}
