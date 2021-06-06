package _08_introducao_programacao_oo._070_exercicio_fixacao._2.exercicio_employee.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public double increaseSalary(double percentage) {
        return grossSalary * (1+(percentage/100.0));
    }

    public String toString() {
        return name
                +", $ "
                +String.format("%.2f", netSalary());
   }
}
