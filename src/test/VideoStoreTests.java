import com.danparkin.videostore.Customer;
import com.danparkin.videostore.Movie;
import com.danparkin.videostore.Rental;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VideoStoreTests {
    @Test
    public void customer_should_print_correct_statement_for_movie_rentals() {
        int firstMovieDaysRentedFor = 10;
        Movie firstRentalMovie = new Movie("Star Wars: Episode VIII - The Last Jedi", Movie.NEW_RELEASE);
        Rental firstRental = new Rental(firstRentalMovie, firstMovieDaysRentedFor);

        int secondMovieDaysRentedFor = 2;
        Movie secondRentalMovie = new Movie("Star Wars: Episode IV - A New Hope", Movie.REGULAR);
        Rental secondRental = new Rental(secondRentalMovie, secondMovieDaysRentedFor);

        int thirdMovieDaysRentedFor = 1;
        Movie thirdRentalMovie = new Movie("The Star Wars Holiday Special", Movie.CHILDRENS);
        Rental thirdRental = new Rental(thirdRentalMovie, thirdMovieDaysRentedFor);

        Customer customer = new Customer("Jane Doe");
        customer.addRental(firstRental);
        customer.addRental(secondRental);
        customer.addRental(thirdRental);

        String expectedStatement =
                "Rental Record for Jane Doe\n" +
                        "\tStar Wars: Episode VIII - The Last Jedi\t30.0\n" +
                        "\tStar Wars: Episode IV - A New Hope\t2.0\n" +
                        "\tThe Star Wars Holiday Special\t1.5\n" +
                        "Amount owed is 33.5\n" +
                        "You earned 4 frequent renter points";

        assertEquals(expectedStatement, customer.statement());
    }

    @Test
    public void regular_movie_rented_for_one_day_costs_two_and_earns_one_frequent_renter_point() {
        int daysRentedFor = 1;
        Movie rentedMovie = new Movie("Some Movie", Movie.REGULAR);
        Rental rental = new Rental(rentedMovie, daysRentedFor);
        Customer customer = new Customer("Jane Doe");
        customer.addRental(rental);

        String expectedStatement =
                "Rental Record for Jane Doe\n" +
                        "\tSome Movie\t2.0\n" +
                        "Amount owed is 2.0\n" +
                        "You earned 1 frequent renter points";

        assertEquals(expectedStatement, customer.statement());
    }

    @Test
    public void regular_movie_rented_for_more_than_two_days_costs_two_plus_one_and_a_half_times_number_of_days_rented_minus_two() {
        int daysRentedFor = 3;
        Movie rentedMovie = new Movie("Some Movie", Movie.REGULAR);
        Rental rental = new Rental(rentedMovie, daysRentedFor);
        Customer customer = new Customer("Jane Doe");
        customer.addRental(rental);

        String expectedStatement =
                "Rental Record for Jane Doe\n" +
                        "\tSome Movie\t3.5\n" +
                        "Amount owed is 3.5\n" +
                        "You earned 1 frequent renter points";

        assertEquals(expectedStatement, customer.statement());
    }

    @Test
    public void childrens_movie_rented_for_one_day_costs_one_point_five_and_earns_one_frequent_renter_point() {
        int daysRentedFor = 1;
        Movie rentedMovie = new Movie("Some Movie", Movie.CHILDRENS);
        Rental rental = new Rental(rentedMovie, daysRentedFor);
        Customer customer = new Customer("Jane Doe");
        customer.addRental(rental);

        String expectedStatement =
                "Rental Record for Jane Doe\n" +
                        "\tSome Movie\t1.5\n" +
                        "Amount owed is 1.5\n" +
                        "You earned 1 frequent renter points";

        assertEquals(expectedStatement, customer.statement());
    }

    @Test
    public void childrens_movie_rented_for_more_than_three_days_costs_one_point_five_plus_one_and_a_half_times_number_of_days_rented_minus_three() {
        int daysRentedFor = 4;
        Movie rentedMovie = new Movie("Some Movie", Movie.CHILDRENS);
        Rental rental = new Rental(rentedMovie, daysRentedFor);
        Customer customer = new Customer("Jane Doe");
        customer.addRental(rental);

        String expectedStatement =
                "Rental Record for Jane Doe\n" +
                        "\tSome Movie\t3.0\n" +
                        "Amount owed is 3.0\n" +
                        "You earned 1 frequent renter points";

        assertEquals(expectedStatement, customer.statement());
    }

    @Test
    public void new_release_costs_three_times_the_number_of_days_rented_for_and_earns_one_frequent_renter_point() {
        int daysRentedFor = 1;
        Movie rentedMovie = new Movie("Some Movie", Movie.NEW_RELEASE);
        Rental rental = new Rental(rentedMovie, daysRentedFor);
        Customer customer = new Customer("Jane Doe");
        customer.addRental(rental);

        String expectedStatement =
                "Rental Record for Jane Doe\n" +
                        "\tSome Movie\t3.0\n" +
                        "Amount owed is 3.0\n" +
                        "You earned 1 frequent renter points";

        assertEquals(expectedStatement, customer.statement());
    }

    @Test
    public void new_release_earns_an_additional_frequent_renter_point_for_any_rental_longer_than_one_day() {
        int daysRentedFor = 3;
        Movie rentedMovie = new Movie("Some Movie", Movie.NEW_RELEASE);
        Rental rental = new Rental(rentedMovie, daysRentedFor);
        Customer customer = new Customer("Jane Doe");
        customer.addRental(rental);

        String expectedStatement =
                "Rental Record for Jane Doe\n" +
                        "\tSome Movie\t9.0\n" +
                        "Amount owed is 9.0\n" +
                        "You earned 2 frequent renter points";

        assertEquals(expectedStatement, customer.statement());
    }
}
