package composingmethods;

import com.danparkin.composingmethods.inlineclass.Person;
import com.danparkin.composingmethods.inlineclass.TelephoneNumber;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InlineClassTests {
    @Test
    public void person_returns_correct_telephone_number() {
        Person person = new Person("John Doe", new TelephoneNumber("777", "111 1111"));
        String expectedTelephoneNumber = "(777) 111 1111";
        assertEquals(expectedTelephoneNumber, person.getTelephoneNumber());
    }
}
