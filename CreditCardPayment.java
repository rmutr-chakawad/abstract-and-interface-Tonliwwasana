public class CreditCardPayment implements Payment{
    public void pay(double amount){
        System.out.println("Credit card payment amount : "+amount+" Baht");
    }
}
