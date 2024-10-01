public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        System.out.println("Starting Balance: " + account.getBalance());
        account.deposit(10);
        System.out.println("Current Balance: " + account.getBalance());
        account.withdraw(50);
        System.out.println("Current Balance: " + account.getBalance());
    }
}