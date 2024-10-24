public class CashRegister {
    public static final double QUARTER = 0.25;
    public final double DIME = .10;
    public final double PENNY = .01;
    public final double NICKLE = .05;

    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public void receivePayment(int dollars, int quarters, int dimes, int nickels, int pennies) {
        payment = dollar + quarters * QUARTER + dimes * DIME + nickels * NICKLE + pennies * PENNY;
    }
}