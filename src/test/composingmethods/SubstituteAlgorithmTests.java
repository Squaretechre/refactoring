package composingmethods;

import com.danparkin.composingmethods.substitutealgorithm.PersonSearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubstituteAlgorithmTests {
    @Test
    public void person_search_should_find_one_person_and_should_be_able_to_find_don() {
       String[] people = {"Don", "John", "Kent"};
       String actualFoundPerson = new PersonSearch().foundPerson(people);
       String expectedFoundPerson = "Don";
       assertEquals(expectedFoundPerson, actualFoundPerson);
    }

    @Test
    public void person_search_should_find_one_person_and_should_be_able_to_find_john() {
        String[] people = {"John", "Don", "Kent"};
        String actualFoundPerson = new PersonSearch().foundPerson(people);
        String expectedFoundPerson = "John";
        assertEquals(expectedFoundPerson, actualFoundPerson);
    }

    @Test
    public void person_search_should_find_one_person_and_should_be_able_to_find_kent() {
        String[] people = {"Kent", "John", "Don"};
        String actualFoundPerson = new PersonSearch().foundPerson(people);
        String expectedFoundPerson = "Kent";
        assertEquals(expectedFoundPerson, actualFoundPerson);
    }

    @Test
    public void person_search_should_not_find_anyone_other_than_don_john_or_kent() {
        String[] people = {"Martin", "Bob", "Mark"};
        String actualFoundPerson = new PersonSearch().foundPerson(people);
        String expectedFoundPerson = "";
        assertEquals(expectedFoundPerson, actualFoundPerson);
    }
}
