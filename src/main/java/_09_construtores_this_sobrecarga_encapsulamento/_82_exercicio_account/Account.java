package exercicios._082_account.exercicio_account;

public class Account {

    private int number;
    private String holder;
    private double balance;

    public final static double TAX = 5.00;

    public Account() {
    }

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public String getholder() {
        return holder;
    }

    public void setholder(String holder) {
        this.holder = holder;
    }

    public double getbalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withDraw(double amount) {
        if(amount > balance) {
            System.out.println("Você entrou no cheque especial!");
            balance -= amount + TAX;
        } else {
            balance -= amount + TAX;
        }
   }

    public String toString() {
        return "Account "
                + number
                +", Holder: "
                +holder
                +", Balance: $ "
                +String.format("%.2f", balance);
    }
}
