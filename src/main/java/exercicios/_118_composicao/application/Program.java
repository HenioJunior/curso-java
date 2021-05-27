package exercicios._118_composicao.application;

import exercicios._118_composicao.entities.Department;
import exercicios._118_composicao.entities.HourContract;
import exercicios._118_composicao.entities.Worker;
import exercicios._118_composicao.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Entrada
        System.out.print("Enter department name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level:");
        String workerLevel = sc.nextLine();

        System.out.print("Base Salary:");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.println("How many contracts to this worker?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + " data:");

            System.out.println("Date (DD/MM/YYYY):");
            Date contractDate = sdf.parse(sc.next());

            System.out.println("Value per hour:");
            double valuePerHour = sc.nextDouble();

            System.out.println("Duration(hours):");
            int hours = sc.nextInt();

            HourContract contracts = new HourContract(contractDate, valuePerHour, hours);

            worker.addContract(contracts);
        }

        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY):");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department : " + worker.getDepartment().getName());
        System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
