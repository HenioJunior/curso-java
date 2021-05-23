package exercicios._054._2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, x;
        int in = 0;
        int out = 0;

        System.out.println("Quantidade de valores? ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i+"º valor");
            x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}
