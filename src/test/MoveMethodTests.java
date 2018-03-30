import com.danparkin.movemethod.Account;
import com.danparkin.movemethod.AccountType;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class MoveMethodTests {
    @Test
    public void account_applies_overdraft_charge_of_10_plus_85_percent_of_days_overdrawn_minus_7_to_premium_account_type_overdrawn_for_more_than_7_days() {
        boolean isPremium = true;
        int daysOverdrawn = 8;
        Account account = new Account(new AccountType(isPremium), daysOverdrawn);

        double actualCharge = account.overdraftCharge();
        double expectedCharge = 10.85;

        assertThat(actualCharge, equalTo(expectedCharge));
    }

    @Test
    public void account_applies_overdraft_charge_of_10_to_premium_account_type_overdrawn_for_up_to_7_days() {
        boolean isPremium = true;
        int daysOverdrawn = 7;
        Account account = new Account(new AccountType(isPremium), daysOverdrawn);

        double actualCharge = account.overdraftCharge();
        double expectedCharge = 10;

        assertThat(actualCharge, equalTo(expectedCharge));
    }

    @Test
    public void account_applies_overdraft_charge_of_175_percent_of_days_overdrawn_for_non_premium_account_type() {
        boolean isPremium = false;
        int daysOverdrawn = 7;
        Account account = new Account(new AccountType(isPremium), daysOverdrawn);

        double actualCharge = account.overdraftCharge();
        double expectedCharge = 12.25;

        assertThat(actualCharge, equalTo(expectedCharge));
    }

    @Test
    public void account_applies_bank_charge_of_4_and_a_half_when_not_overdrawn() {
        boolean isPremium = false;
        int daysOverdrawn = 0;
        Account account = new Account(new AccountType(isPremium), daysOverdrawn);

        double actualCharge = account.bankCharge();
        double expectedCharge = 4.5;

        assertThat(actualCharge, equalTo(expectedCharge));
    }
}
