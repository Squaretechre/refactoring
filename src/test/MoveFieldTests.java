import com.danparkin.movefield.Account;
import com.danparkin.movefield.AccountType;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MoveFieldTests {
    @Test
    public void account_calculates_correct_amount_of_interest_for_a_given_period_in_days() {
        Account account = new Account(new AccountType(), 2.0);
        int amount = 100;
        int twoYearsInDays = 730;
        double actualInterest = account.interestForAmountDays(amount, twoYearsInDays);
        double expectedInterest = 400;
        assertThat(actualInterest, equalTo(expectedInterest));
    }
}
