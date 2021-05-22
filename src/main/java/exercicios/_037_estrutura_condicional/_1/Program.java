package exercicios._037_estrutura_condicional._1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        if (x > 0) {
            System.out.println("POSITIVO");
        } else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
