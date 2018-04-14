package composingmethods;

import com.danparkin.composingmethods.removeassignmenttoparameters.ObjectParam;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class RemoveAssignmentToParametersObjectParamTests {
    @Test
    public void reassignment_to_parameter_should_not_affect_original_object_reference() {
        PrintStream originalStdout = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        String expectedDateWhenReassigningToParameter =
                "arg in nextDateReplace: Thu Apr 02";

        String expectedOriginalDateAfterReassignmentToParameter
                = "c2 after nextDateReplace: Wed Apr 01";

        ObjectParam.main(new String[0]);

        String actualOutput = buffer.toString();
        System.setOut(originalStdout);

        assertThat(actualOutput, containsString(expectedDateWhenReassigningToParameter));
        assertThat(actualOutput, containsString(expectedOriginalDateAfterReassignmentToParameter));
    }

    @Test
    public void mutating_object_reference_without_assignment_should_affect_original_object_reference() {
        PrintStream originalStdout = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        String expectedDateWhenReassigningToParameter =
                "arg in nextDateUpdate: Thu Apr 02";

        String expectedOriginalDateAfterReassignmentToParameter
                = "c1 after nextDateUpdate: Thu Apr 02";

        ObjectParam.main(new String[0]);

        String actualOutput = buffer.toString();
        System.setOut(originalStdout);

        assertThat(actualOutput, containsString(expectedDateWhenReassigningToParameter));
        assertThat(actualOutput, containsString(expectedOriginalDateAfterReassignmentToParameter));
    }
}
