package _14_heranca_polimorfismo._126_upcasting_downcasting.application;

import _14_heranca_polimorfismo._126_upcasting_downcasting.entities.Account;
import _14_heranca_polimorfismo._126_upcasting_downcasting.entities.BusinessAccount;
import _14_heranca_polimorfismo._126_upcasting_downcasting.entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);

        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 500.0);
        Account acc3 = new SavingsAccount(1004, "Antonio", 0.0, 100.0);

        //DOWNCASTING

//        BusinessAccount acc4 = acc2; Não posso converter o Account para BusinessAccount
//        Para isso, é necessário o downcasting;

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

//        BusinessAccount acc5 = (BusinessAccount)acc3;
//        Como o acc3 é do tipo SavingAccount, para evitar erro será necessário testar usando o instanceof;

        if(acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");

        }
    }
}
