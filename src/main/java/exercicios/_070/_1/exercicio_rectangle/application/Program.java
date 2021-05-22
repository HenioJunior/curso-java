package exercicios._070._1.exercicio_rectangle.application;

import exercicios._070._1.exercicio_rectangle.entities.Rectangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");
        Rectangle rectangle = new Rectangle();
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        System.out.println(rectangle);

        sc.close();
    }
}
