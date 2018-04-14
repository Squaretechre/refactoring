import com.danparkin.selfencapsulatefield.IntRange;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class SelfEncapsulateFieldTests {
    @Test
    public void int_range_returns_true_when_range_includes_number_requested() {
        IntRange range = new IntRange(1, 10);
        assertTrue(range.includes(5));
    }

    @Test
    public void int_range_returns_false_when_range_does_not_include_number_requested() {
        IntRange range = new IntRange(1, 10);
        assertFalse(range.includes(11));
    }

    @Test
    public void grow_increases_upper_bound_of_range_by_requested_factor() {
        IntRange range = new IntRange(1, 10);
        range.grow(2);
        assertTrue(range.includes(20));
    }

    @Test
    public void grow_increases_upper_bound_by_no_more_than_requested_factor() {
        IntRange range = new IntRange(1, 10);
        range.grow(2);
        assertFalse(range.includes(21));
    }

    @Test
    public void grow_does_not_affect_the_lower_bound_of_range() {
        IntRange range = new IntRange(5, 10);
        range.grow(2);
        assertFalse(range.includes(4));
        assertTrue(range.includes(5));
    }
}
