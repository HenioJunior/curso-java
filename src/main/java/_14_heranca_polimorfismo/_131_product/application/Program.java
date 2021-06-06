package _14_heranca_polimorfismo._131_product.application;

import _14_heranca_polimorfismo._131_product.entities.ImportedProducts;
import _14_heranca_polimorfismo._131_product.entities.Product;
import _14_heranca_polimorfismo._131_product.entities.UsedProducts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        Integer n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if(ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProducts(name, price, customsFee));
            } else if(ch == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                list.add(new UsedProducts(name, price, manufactureDate));
            } else {
                list.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for(Product prod : list) {
            System.out.println(prod.priceTag());
        }
        sc.close();
    }
}
