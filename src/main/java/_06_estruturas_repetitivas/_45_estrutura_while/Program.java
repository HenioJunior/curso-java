package _06_estruturas_repetitivas._45_estrutura_while;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x = sc.nextInt();

        while (x != 0) {
            x = sc.nextInt();
        }
        sc.close();
    }
}
