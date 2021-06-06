package _14_heranca_polimorfismo._134_tax_payer.entities;

public class Individual extends TaxPayer {

    private Double healthExpense;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpense) {
        super(name, anualIncome);
        this.healthExpense = healthExpense;
    }

    public Double getHealthExpense() {
        return healthExpense;
    }

    public void setHealthExpense(Double healthExpense) {
        this.healthExpense = healthExpense;
    }

    @Override
    public Double tax() {
        if(getAnualIncome() < 20000) {
            return getAnualIncome() * 15/100;
        } else {
            if (healthExpense > 0) {
                return getAnualIncome() * 25/100 - getHealthExpense()*50/100;
            } else {
                return getAnualIncome() * 25/100;
            }
        }
    }
}
