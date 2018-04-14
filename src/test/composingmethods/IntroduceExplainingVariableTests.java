package composingmethods;

import com.danparkin.composingmethods.introduceexplainingvariable.Order;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class IntroduceExplainingVariableTests {
    @Test
    public void order_should_add_ten_percent_postage_to_total_price() {
        int quantity = 2;
        int itemPrice = 10;
        Order order = new Order(quantity, itemPrice);

        double actualPrice = order.price();
        double expectedPrice = 22.00;

        assertThat(actualPrice, equalTo(expectedPrice));
    }

    @Test
    public void order_should_only_add_a_max_of_one_hundred_postage() {
        int quantity = 510;
        int itemPrice = 10;
        Order order = new Order(quantity, itemPrice);

        double actualPrice = order.price();
        double expectedPrice = 5195.00;

        assertThat(actualPrice, equalTo(expectedPrice));
    }

    @Test
    public void order_should_apply_five_percent_of_base_price_discount_when_quantity_is_greater_than_five_hundred() {
        int quantity = 501;
        int itemPrice = 1;
        Order order = new Order(quantity, itemPrice);

        double actualPrice = order.price();
        double expectedPrice = 551.05;

        assertThat(actualPrice, equalTo(expectedPrice));
    }

    @Test
    public void order_should_not_apply_five_percent_of_base_price_discount_when_quantity_is_five_hundred_or_less() {
        int quantity = 500;
        int itemPrice = 1;
        Order order = new Order(quantity, itemPrice);

        double actualPrice = order.price();
        double expectedPrice = 550.00;

        assertThat(actualPrice, equalTo(expectedPrice));
    }
}
