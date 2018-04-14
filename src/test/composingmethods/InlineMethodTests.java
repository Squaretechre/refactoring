package composingmethods;

import com.danparkin.composingmethods.inlinemethod.Customer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InlineMethodTests {
    @Test
    public void customer_rating_should_be_two_after_move_than_five_late_deliveries() {
        int numberOfLateDeliveries = 6;
        Customer customer = new Customer(numberOfLateDeliveries);
        assertEquals(2, customer.getRating());
    }

    @Test
    public void customer_rating_should_be_one_when_less_than_five_late_deliveries() {
        int numberOfLateDeliveries = 4;
        Customer customer = new Customer(numberOfLateDeliveries);
        assertEquals(1, customer.getRating());
    }

    @Test
    public void customer_rating_should_be_one_when_has_exactly_five_late_deliveries() {
        int numberOfLateDeliveries = 5;
        Customer customer = new Customer(numberOfLateDeliveries);
        assertEquals(1, customer.getRating());
    }
}
