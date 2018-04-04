import com.danparkin.hidedelegate.Department;
import com.danparkin.hidedelegate.Person;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

// There isn't anything to test with this example.
// The test is just here to demonstrate the example given on page 159 of Refactoring that
// shows a case where the Person class is revealing too much about itself by forcing clients
// to go through the Department field in order to get a person's manager.
public class HideDelegateTests {
    @Test
    public void can_create_train_wreck_by_getting_a_persons_manager_via_department_field() {
        Person jane = new Person("Jane Doe");
        Person john = new Person("John Doe");
        Department sales = new Department(jane);

        john.setDepartment(sales);
        Person manager = john.getDepartment().getManager();
        assertEquals("Jane Doe", manager.Name);
    }
}
