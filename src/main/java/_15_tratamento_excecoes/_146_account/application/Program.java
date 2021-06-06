package _15_tratamento_excecoes._146_account.application;

import _15_tratamento_excecoes._146_account.model.entities.Account;
import _15_tratamento_excecoes._146_account.model.exceptions.DomainException;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial Balance: ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.println();

        try {
            System.out.print("Enter amount for withdraw:");
            Double withdraw = sc.nextDouble();
            account.withdraw(withdraw);
            System.out.print(account);
        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        sc.close();
    }
}
