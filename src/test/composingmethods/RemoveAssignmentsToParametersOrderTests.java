package composingmethods;

import com.danparkin.composingmethods.removeassignmenttoparameters.Order;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveAssignmentsToParametersOrderTests {
    @Test
    public void no_discount_is_applied_to_input_value_when_non_of_the_discount_criteria_are_met() {
        int inputVal = 20;
        int quantity = 50;
        int yearToDate = 10000;
        int actualDiscountedValue = new Order().discount(inputVal, quantity, yearToDate);
        int expectedDiscountedValue = 20;
        assertEquals(expectedDiscountedValue, actualDiscountedValue);
    }

    @Test
    public void correct_discount_is_applied_to_input_value_when_all_discount_criteria_are_met() {
        int inputVal = 51;
        int quantity = 101;
        int yearToDate = 10001;
        int actualDiscountedValue = new Order().discount(inputVal, quantity, yearToDate);
        int expectedDiscountedValue = 44;
        assertEquals(expectedDiscountedValue, actualDiscountedValue);
    }

    @Test
    public void input_value_greater_than_fifty_applies_discount_of_two() {
        int inputVal = 51;
        int quantity = 100;
        int yearToDate = 10000;
        int actualDiscountedValue = new Order().discount(inputVal, quantity, yearToDate);
        int expectedDiscountedValue = 49;
        assertEquals(expectedDiscountedValue, actualDiscountedValue);
    }

    @Test
    public void quantity_greater_than_one_hundred_applies_discount_of_one() {
        int inputVal = 50;
        int quantity = 101;
        int yearToDate = 10000;
        int actualDiscountedValue = new Order().discount(inputVal, quantity, yearToDate);
        int expectedDiscountedValue = 49;
        assertEquals(expectedDiscountedValue, actualDiscountedValue);
    }

    @Test
    public void year_to_date_greater_than_ten_thousand_applies_discount_of_four() {
        int inputVal = 50;
        int quantity = 100;
        int yearToDate = 10001;
        int actualDiscountedValue = new Order().discount(inputVal, quantity, yearToDate);
        int expectedDiscountedValue = 46;
        assertEquals(expectedDiscountedValue, actualDiscountedValue);
    }
}
