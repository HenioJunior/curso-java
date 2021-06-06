package _08_introducao_programacao_oo._67_69_exercicio_product.application;

import _08_introducao_programacao_oo._67_69_exercicio_product.entities.Product;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter Product Data");
        System.out.println("Name:");
        product.name = sc.nextLine();

        System.out.println("Price:");
        product.price = sc.nextDouble();

        System.out.println("Quantity in stock");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock:");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock:");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
