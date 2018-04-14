import com.danparkin.introducelocalextension.BillingPeriod;
import com.danparkin.introducelocalextension.MfDateSub;
import com.danparkin.introducelocalextension.MfDateWrap;
import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;

public class IntroduceLocalExtensionTests {
    @Test
    public void roll_over_via_sub_classed_date_increments_date_by_1_day() {
        Date expectedDate = new Date(2018, 04, 14);
        MfDateSub previousEndDate = new MfDateSub(new Date(2018, 04, 13));
        Date actualDate = new BillingPeriod(previousEndDate).rollOverViaSubclassedDate();
        assertEquals(expectedDate.toString(), actualDate.toString());
    }

    @Test
    public void roll_over_via_wrapped_date_class_increments_date_by_1_day() {
        Date expectedDate = new Date(2018, 04, 14);
        MfDateWrap previousEndDate = new MfDateWrap(new Date(2018, 04, 13));
        Date actualDate = new BillingPeriod(previousEndDate).rollOverViaWrappedDate();
        assertEquals(expectedDate.toString(), actualDate.toString());
    }
}
