package _06_estruturas_repetitivas._49_exercicios._1;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha:");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha inválida!");

            System.out.println("Digite a senha:");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");

        sc.close();
    }
}
