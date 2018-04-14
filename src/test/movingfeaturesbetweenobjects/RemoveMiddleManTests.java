package movingfeaturesbetweenobjects;

import com.danparkin.movingfeaturesbetweenobjects.removemiddleman.Department;
import com.danparkin.movingfeaturesbetweenobjects.removemiddleman.Person;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

// There isn't anything to test with this example.
// The test is just here to demonstrate the example given on page 161 of Refactoring that
// shows a case where the Person class is acting as a middle man and has no other behaviour
// other than delegating to Department to get the manager.
public class RemoveMiddleManTests {
    @Test
    public void can_get_a_persons_manager() {
        Person jane = new Person("Jane Doe");
        Person john = new Person("John Doe");
        Department sales = new Department(jane);

        john.setDepartment(sales);
        Person manager = john.getManager();
        assertEquals("Jane Doe", manager.Name);
    }
}
