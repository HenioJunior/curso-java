package exercicios._070._2.exercicio_employee.application;

import exercicios._070._2.exercicio_employee.entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("Name: ");
        employee.name = sc.nextLine();

        System.out.println("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: "+employee );

        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.grossSalary = employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: "+employee);

        sc.close();
    }
}
