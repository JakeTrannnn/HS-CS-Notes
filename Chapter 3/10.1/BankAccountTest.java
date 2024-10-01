public class BankAccountTest {
    @Test
    public void testCreateAccount() {
        double expected = 100;
        BankAccount account = new BankAccount(100);
        double actual = account.getBalance();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testDeposit() {
        double expected = 300;
        BankAccount account = new BankAccount(100);
        account.deposit(200);
        double actual = account.getBalance();
        Assertions.assertEquals(expected,actual);
    }
}