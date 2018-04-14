package organizingdata;

import com.danparkin.organizingdata.replacedatavaluewithobject.Client;
import com.danparkin.organizingdata.replacedatavaluewithobject.Order;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ReplaceDataValueWithObjectTests {
    @Test
    public void calculates_the_correct_number_of_orders_for_a_given_customer() {
        String johnDoe = "John Doe";
        String janeDoe = "Jane Doe";
        Order first = new Order(johnDoe);
        Order second = new Order(johnDoe);
        Order third = new Order(johnDoe);
        Order fourth = new Order(janeDoe);
        ArrayList<Order> orders = new ArrayList<Order>() {{
            add(first);
            add(second);
            add(third);
            add(fourth);
        }};
        assertEquals(3, Client.numberOfOrdersFor(orders, johnDoe));
        assertEquals(1, Client.numberOfOrdersFor(orders, janeDoe));
    }
}
