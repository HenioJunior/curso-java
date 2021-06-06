package _09_construtores_this_sobrecarga_encapsulamento._76_construtores.application;

import _09_construtores_this_sobrecarga_encapsulamento._76_construtores.entities.Product;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product Data");
        System.out.println("Name:");
        String name = sc.nextLine();

        System.out.println("Price:");
        double price = sc.nextDouble();

        System.out.println("Quantity in stock");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Product data:"+product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock:");
        quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("Updated data: "+product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock:");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        System.out.println("Updated data: "+product);

        sc.close();
    }
}
