public class CashRegisterApp {
    public static void main(String[] args) {
        var cashRegister = new CashRegister();
        System.out.println(CashRegister.QUARTER);
        cashRegister.recordPurchase(2.50);

        System.out.printf("Total Purchase is: $%.2f" + cashRegister.getTotal());
        cashRegister.receivePayment(100, 9, 9, 9, 9);
        System.out.printf("Your change $%.2f", cashRegister.giveChange());
    }
}