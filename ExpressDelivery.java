public class ExpressDelivery extends LogisticsService implements Deliverable{
    ExpressDelivery(){
        super("Express Delivery");
    }

    public double calculateShippingCost(double weight){
        return 50 + (weight * 10);
    }

    @Override
    public String getServiceType(){
        return "ด่วนพิเศษ";
    }
}
