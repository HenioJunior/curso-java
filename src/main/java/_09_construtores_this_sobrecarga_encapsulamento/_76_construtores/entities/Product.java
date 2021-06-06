package _09_construtores_this_sobrecarga_encapsulamento._76_construtores.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public int addProduct(int quantity) {
        return this.quantity += quantity;
    }

    public int removeProduct(int quantity) {
        return this.quantity -= quantity;
    }

    public String toString() {
        return name
                +", $ "
                +String.format("%.2f", price)
                +", "
                +quantity
                +" units, Total: $ "
                +String.format("%.2f", totalValueInStock());
    }
}
