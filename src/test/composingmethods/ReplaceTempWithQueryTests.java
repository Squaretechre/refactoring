package composingmethods;

import com.danparkin.composingmethods.replacetempwithquery.Order;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ReplaceTempWithQueryTests {
    @Test
    public void order_should_apply_two_percent_discount_when_total_order_cost_under_or_equal_to_one_thousand() {
        double expectedPrice = 980.00;
        double actualPrice = new Order(2, 500).getPrice();
        assertThat(actualPrice, equalTo(expectedPrice));
    }

    @Test
    public void order_should_apply_five_percent_discount_when_total_order_cost_over_one_thousand() {
        double expectedPrice = 1425.00;
        double actualPrice = new Order(3, 500).getPrice();
        assertThat(actualPrice, equalTo(expectedPrice));
    }
}
