package escopo_inicializacao;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double discount;

        double price = sc.nextDouble();
        if (price > 100.0) {
            discount = price * 0.1;
        }
        else {
            discount = 0.0;
        }

        System.out.println(discount);
    }
}
