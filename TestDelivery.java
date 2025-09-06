public class TestDelivery {
    public static void main(String[] args) {
        double weight = 10.0;

        Deliverable express = new ExpressDelivery();
        Deliverable economy = new EconomyDelivery();

        double expressCost = express.calculateShippingCost(weight);
        double economyCost = economy.calculateShippingCost(weight);

        System.out.println("Product Weight : " + weight + " kg.");
        System.out.println("Express Delivery Cost : " + expressCost + " Baht");
        System.out.println("Economy Delivery Cost : " + economyCost + " Baht");

        if(expressCost < economyCost){
            System.out.println("Express delivery is cheaper");
        }else if(expressCost > economyCost){
            System.out.println("Economy delivery is cheaper");
        }else{
            System.out.println("Shipping costs are equal");
        }
    }
}
