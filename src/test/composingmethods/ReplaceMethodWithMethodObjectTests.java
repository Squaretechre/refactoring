package composingmethods;

import com.danparkin.composingmethods.replacemethodwithmethodobject.Account;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Note: this method is nonsensical and the tests are merely here to categorize it.
// Martin Fowler provides a disclaimer for the gamma method in the book:
//  "Don't ask what the logic of this method is, I made it up as I went along".
public class ReplaceMethodWithMethodObjectTests {
    @Test
    public void gamma_when_year_to_date_minus_important_value_1_less_than_100() {
        Account account = new Account();
        int inputVal = 10;
        int quantity = 5;
        int yearToDate = 10000;
        int actualGamma = account.gamma(inputVal, quantity, yearToDate);
        int expectedGama = 700260;

        assertEquals(expectedGama, actualGamma);
    }

    @Test
    public void gamma_when_year_to_date_minus_important_value_1_greater_than_100() {
        Account account = new Account();
        int inputVal = 100;
        int quantity = 110;
        int yearToDate = 10000;
        int actualGamma = account.gamma(inputVal, quantity, yearToDate);
        int expectedGama = 6978500;

        assertEquals(expectedGama, actualGamma);
    }
}
