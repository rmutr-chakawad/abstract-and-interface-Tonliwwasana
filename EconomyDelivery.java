public class EconomyDelivery extends LogisticsService implements Deliverable{
    EconomyDelivery(){
        super("Economy Delivery");
    }

    public double calculateShippingCost(double weight){
        return 20 + (weight * 5);
    }

    @Override
    public String getServiceType(){
        return "ประหยัด";
    }
}
