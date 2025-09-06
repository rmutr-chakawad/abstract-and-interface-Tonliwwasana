public class TestPayment {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new BankTransferPayment();

        p1.pay(1000.00);
        p2.pay(6000.00);
    }
}
