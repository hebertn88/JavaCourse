package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account() {
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        this.deposit(initialDeposit);
    }

    public int getNumber() {
        return this.number;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5;
    }

    public String toString() {
        return String.format(
                "Conta: %d, Titular: %s, Saldo: $ %.2f",
                this.number,
                this.holder,
                this.balance
        );
    }

}
