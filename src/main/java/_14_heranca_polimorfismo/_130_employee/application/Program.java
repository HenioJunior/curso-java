package _14_heranca_polimorfismo._130_employee.application;

import _14_heranca_polimorfismo._130_employee.entities.Employee;
import _14_heranca_polimorfismo._130_employee.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<Employee>();

        System.out.print("Enter the number of employees: ");
        Integer n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Additional charge: ");
                Double addCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, addCharge));
            } else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for(Employee e : list) {
            System.out.println(e.getName() + " - $ " + e.payment());
        }
    }
}
