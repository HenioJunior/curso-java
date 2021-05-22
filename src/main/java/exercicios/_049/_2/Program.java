package exercicios._049._2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Valor de x:");
        double x = sc.nextDouble();
        System.out.println("Valor de y:");
        double y = sc.nextDouble();

        while (x != 0 || y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else
                System.out.println("quarto");

            System.out.println("Valor de x:");
            x = sc.nextDouble();
            System.out.println("Valor de y:");
            y = sc.nextDouble();

            System.out.println("Origem");
        }

        sc.close();
    }
}
