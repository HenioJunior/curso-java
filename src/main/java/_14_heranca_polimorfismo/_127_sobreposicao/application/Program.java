package _14_heranca_polimorfismo._127_sobreposicao.application;

import _14_heranca_polimorfismo._127_sobreposicao.entities.Account;
import _14_heranca_polimorfismo._127_sobreposicao.entities.BusinessAccount;
import _14_heranca_polimorfismo._127_sobreposicao.entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Alex", 1000.00);
        acc1.withDraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
        acc2.withDraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.00, 500.0);
        acc3.withDraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
