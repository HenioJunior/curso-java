package _20_prog_funcional_expressoes_lambda._219_comparator.demo1.application;

import _20_prog_funcional_expressoes_lambda._219_comparator.demo1.entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product>{

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
