/**
 * a wonderful bank account that will fulfill all your bank account needs
 */
public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}