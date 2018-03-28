import com.danparkin.videostore.Customer;
import com.danparkin.videostore.Movie;
import com.danparkin.videostore.Rental;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class VideoStoreTests {
    @Test
    public void customer_should_print_correct_statement_for_movie_rentals() {
        PrintStream originalStdout = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        int firstMovieDaysRentedFor = 10;
        Movie firstRentalMovie = new Movie("Star Wars: Episode VIII - The Last Jedi", Movie.NEW_RELEASE);
        Rental firstRental = new Rental(firstRentalMovie, firstMovieDaysRentedFor);

        int secondMovieDaysRentedFor = 2;
        Movie secondRentalMovie = new Movie("Star Wars: Episode IV - A New Hope", Movie.NEW_RELEASE);
        Rental secondRental = new Rental(secondRentalMovie, secondMovieDaysRentedFor);

        int thirdMovieDaysRentedFor = 1;
        Movie thirdRentalMovie = new Movie("The Star Wars Holiday Special", Movie.CHILDRENS);
        Rental thirdRental = new Rental(thirdRentalMovie, thirdMovieDaysRentedFor);

        Customer movieRenter = new Customer("Jane Doe");
        movieRenter.addRental(firstRental);
        movieRenter.addRental(secondRental);
        movieRenter.addRental(thirdRental);

        System.out.println(movieRenter.statement());

        String actualOutput = buffer.toString();
        System.setOut(originalStdout);

        String expectedOutput =
                "Rental Record for Jane Doe\n" +
                "\tStar Wars: Episode VIII - The Last Jedi\t30.0\n" +
                "\tStar Wars: Episode IV - A New Hope\t6.0\n" +
                "\tThe Star Wars Holiday Special\t1.5\n" +
                "Amount owed is 37.5\n" +
                "You earned 5 frequent renter points\n";

        assertEquals(expectedOutput, actualOutput);
    }
}
