package exercicios._134_tax_payer.application;

import exercicios._134_tax_payer.entities.Company;
import exercicios._134_tax_payer.entities.Individual;
import exercicios._134_tax_payer.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)?");
            char question = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(question == 'i') {
                System.out.print("Health expenses: ");
                double healthExpenses = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenses));
            }else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }
        System.out.println();
        System.out.println("TAX PAID: ");
        double sum = 0;
        for(TaxPayer tp: list) {
            System.out.println(tp.getName() + ": $ " + tp.tax() );
            sum += tp.tax();
        }
        System.out.println();
        System.out.print("TOTAL TAXES: $ " + sum);
        sc.close();
    }
}
