package movingfeaturesbetweenobjects;

import com.danparkin.movingfeaturesbetweenobjects.extractclass.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExtractClassTests {
    @Test
    public void person_returns_telephone_number_prefixed_with_office_area_code_in_brackets() {
        Person person = new Person("John Doe", "101", "222 4444");
        String expectedTelephoneNumber = "(101) 222 4444";
        String actualTelephoneNumber = person.getTelephoneNumber();
        assertEquals(expectedTelephoneNumber, actualTelephoneNumber);
    }
}
