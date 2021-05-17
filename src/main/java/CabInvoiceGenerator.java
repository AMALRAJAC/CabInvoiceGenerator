public class CabInvoiceGenerator {
    private static final int COST_PER_TIME=1;
    private static final double MINIMUM_COST_PER_KILOMETER=10;
    private  static final double MINIMUM_FARE=5;
    public static double calculateFare(double Distance, int time){
        double fare= Distance*MINIMUM_COST_PER_KILOMETER+time*COST_PER_TIME;
        if(fare<MINIMUM_FARE){
            return MINIMUM_FARE;
        }else{
            return fare;
        }
    }
    public double calculateFare(Ride[] rides){
        double totalFare=0;
        for(Ride ride:rides){
            totalFare+=calculateFare(ride.distance,ride.time);
        }
        return 0;
    }
}
