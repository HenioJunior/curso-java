package _09_construtores_this_sobrecarga_encapsulamento._82_exercicio_account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();

        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if(response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double depositValue = sc.nextDouble();
            account = new Account(number, holder, depositValue);
            System.out.println("Account data: ");
            System.out.println(account);
        }else {
            account = new Account(number, holder);
            System.out.println("Account data: ");
            System.out.println(account);
        }

        System.out.println("Enter a deposit value: ");
        account.deposit(sc.nextDouble());

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println("Enter a withdraw value: ");
        account.withDraw(sc.nextDouble());

        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();
    }
}
