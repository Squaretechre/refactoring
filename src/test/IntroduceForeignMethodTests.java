import com.danparkin.introduceforeignmethod.BillingPeriod;
import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;

public class IntroduceForeignMethodTests {
    @Test
    public void roll_over_increments_date_by_1_day() {
        Date expectedDate = new Date(2018, 04, 14);
        Date actualDate = new BillingPeriod(new Date(2018, 04, 13)).rollOver();
        assertEquals(expectedDate.toString(), actualDate.toString());
    }
}
