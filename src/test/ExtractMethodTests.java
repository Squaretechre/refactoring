import extract.method.Order;
import extract.method.OrderHistory;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ExtractMethodTests {
    @Test
    public void prints_statement_showing_customer_name_and_amounted_owed_based_off_order_history() {
        ArrayList<Order> orders = new ArrayList<Order>() {
            {
                add(new Order(10));
                add(new Order(20));
                add(new Order(30));
            }
        };
        OrderHistory orderHistory = new OrderHistory(orders, "John Doe");

        PrintStream originalStdout = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        orderHistory.printOwing();

        String expectedOutput =
                "***********************\n" +
                "**** Customer Owes ****\n" +
                "***********************\n" +
                "name: John Doe\n" +
                "amount: 60.0\n";

        String actualOutput = buffer.toString();
        System.setOut(originalStdout);

        assertEquals(expectedOutput, actualOutput);
    }
}
