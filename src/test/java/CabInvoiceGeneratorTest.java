import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTimeShouldReturnTotalFare(){
        CabInvoiceGenerator invoiceGenerator= new CabInvoiceGenerator();
        Double distance=2.0;
        int time=5;
        double fare=invoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(25,fare);
    }
    @Test
    public  void givenInvoiceGeneratorShouldReturnMinimumValue(){
        CabInvoiceGenerator invoiceGenerator= new CabInvoiceGenerator();
        Double distance=0.1;
        int time=1;
        double fare=invoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(5,fare);
    }


}
