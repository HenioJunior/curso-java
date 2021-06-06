package _14_heranca_polimorfismo._128_classes_metodos_final.entities;

public class SavingsAccountPlus extends SavingsAccount {

    @Override
    public void withDraw(Double amount) {
        balance -= amount + 2.0;
    }
}
