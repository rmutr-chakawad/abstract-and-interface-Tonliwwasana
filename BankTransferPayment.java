public class BankTransferPayment implements Payment{
    public void pay(double amount){
        System.out.println("Bank transfer amount : "+amount+" Baht");
    }
}
