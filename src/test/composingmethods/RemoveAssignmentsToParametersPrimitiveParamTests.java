package composingmethods;

import com.danparkin.composingmethods.removeassignmenttoparameters.PrimitiveParam;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class RemoveAssignmentsToParametersPrimitiveParamTests {
    @Test
    public void original_value_of_x_should_not_be_mutated_by_calling_triple() {
        PrintStream originalStdout = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        String expectedOutput =
                "arg in triple: 15\n" +
                "x after triple: 5";

        PrimitiveParam.main(new String[0]);

        String actualOutput = buffer.toString();
        System.setOut(originalStdout);

        assertThat(actualOutput, containsString(expectedOutput));
    }
}
