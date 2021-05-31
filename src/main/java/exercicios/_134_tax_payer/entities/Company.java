package exercicios._134_tax_payer.entities;

public class Company extends TaxPayer {
    private Integer employeesNumber;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, Integer employeesNumber) {
        super(name, anualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public Double tax() {
        if(employeesNumber > 10) {
            return getAnualIncome() * 14/100;
        } else {
            return getAnualIncome() * 16/100;
        }
    }
}
