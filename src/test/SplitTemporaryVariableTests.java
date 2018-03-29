import com.danparkin.splittemporaryvariable.Haggis;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class SplitTemporaryVariableTests {
    @Test
    public void haggis_should_calculate_correct_distance_travelled_with_only_primary_force_applied() {
        double primaryForce = 1.0;
        double secondaryForce = 0;
        int mass = 10;
        int delay = 5;
        int time = 100;

        Haggis haggis = new Haggis(primaryForce, secondaryForce, mass, delay);

        double actualDistance = haggis.getDistanceTravelled(time);
        double expectedDistance = 500.0;

        assertThat(actualDistance, equalTo(expectedDistance));
    }

    @Test
    public void haggis_should_calculate_correct_distance_travelled_with_both_primary_and_secondary_force_applied() {
        double primaryForce = 1.0;
        double secondaryForce = 2.0;
        int mass = 10;
        int delay = 5;
        int time = 100;

        Haggis haggis = new Haggis(primaryForce, secondaryForce, mass, delay);

        double actualDistance = haggis.getDistanceTravelled(time);
        double expectedDistance = 1402.5;

        assertThat(actualDistance, equalTo(expectedDistance));
    }
}
