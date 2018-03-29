package com.danparkin.videostore;

import com.danparkin.splittemporaryvariable.Haggis;

public class Main {

    public static void main(String[] args) {
        int firstMovieDaysRentedFor = 10;
        Movie firstRentalMovie = new Movie("Star Wars: Episode VIII - The Last Jedi", Movie.NEW_RELEASE);
        Rental firstRental = new Rental(firstRentalMovie, firstMovieDaysRentedFor);

        int secondMovieDaysRentedFor = 2;
        Movie secondRentalMovie = new Movie("Star Wars: Episode IV - A New Hope", Movie.REGULAR);
        Rental secondRental = new Rental(secondRentalMovie, secondMovieDaysRentedFor);

        int thirdMovieDaysRentedFor = 1;
        Movie thirdRentalMovie = new Movie("The Star Wars Holiday Special", Movie.CHILDRENS);
        Rental thirdRental = new Rental(thirdRentalMovie, thirdMovieDaysRentedFor);

        Customer movieRenter = new Customer("John Doe");
        movieRenter.addRental(firstRental);
        movieRenter.addRental(secondRental);
        movieRenter.addRental(thirdRental);

        System.out.println(movieRenter.statement());
    }
}
