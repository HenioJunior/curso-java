package exercicios._054._1;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Leia um valor inteiro: ");
        int x = sc.nextInt();

        for(int i=1; i <= x; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
       sc.close();
    }
}
