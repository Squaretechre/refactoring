import com.danparkin.inlinetemp.Order;
import com.danparkin.inlinetemp.OrderRule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InlineTempTests {
    @Test
    public void order_rule_should_be_true_when_orders_base_price_greater_than_one_thousand() {
        assertEquals(new OrderRule(new Order(1001)).validate(), true);
    }

    @Test
    public void order_rule_should_be_false_when_orders_base_price_less_than_or_equal_to_one_thousand() {
        assertEquals(new OrderRule(new Order(1000)).validate(), false);
    }
}
