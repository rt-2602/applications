package com.rashmi;

import java.util.ArrayList;

public class MovieTheater {

    ArrayList<Movie> movieDetails = new ArrayList<Movie>();

    public void movieDetails() {

        System.out.println(" \n  \t \t ***** Movie 1 *****");
        Movie movie = new Movie();
        movie.setMovieName("DDLJ");
        movie.setScreen("Screen 1");
        movie.setMovieSummary("Love Story");
        movie.setStarCast("Sharukh Khan, Kajol");
        movie.setScreenCapacity(10);


        movie.addShowTimings("10am");
        movie.addShowTimings("2pm");
        movie.addShowTimings("7pm");

        movie.setShowTimings(movie.getShowTimings());

        movieDetails.add(movie);
        System.out.println(movieDetails.get(0).getMovieName() + "\n" + movieDetails.get(0).getScreen() + "\n" + movieDetails.get(0).getMovieSummary() + "\n" + movieDetails.get(0).getStarCast() + "\n" + movieDetails.get(0).getShowTimings());

        System.out.println(" \n  \t \t ***** Movie 2 *****");
        Movie movie2 = new Movie();
        movie2.setMovieName("Dostana");
        movie2.setScreen("Screen 2");
        movie2.setMovieSummary("Love Story");
        movie2.setStarCast("John Abraham, Abhishek bachan, Priyanka Chopra");
        movie2.setScreenCapacity(8);


        movie2.addShowTimings("11am");
        movie2.addShowTimings("3pm");
        movie2.addShowTimings("7pm");


        movie2.setShowTimings(movie2.getShowTimings());

        movieDetails.add(movie2);
        System.out.println(movieDetails.get(1).getMovieName() + "\n" + movieDetails.get(1).getScreen() + "\n" + movieDetails.get(1).getMovieSummary() + "\n" + movieDetails.get(1).getStarCast() + "\n" + movieDetails.get(1).getShowTimings());

        System.out.println(" \n  \t \t ***** Movie 3 ***** ");
        Movie movie3 = new Movie();
        movie3.setMovieName("Mujhse shadi karogi");
        movie3.setScreen("Screen 3");
        movie3.setMovieSummary("Love Story");
        movie3.setStarCast("Akshay Kumar, Salman Khan, Priyanka Chopra");
        movie3.setScreenCapacity(5);


        movie3.addShowTimings("10am");
        movie3.addShowTimings("4pm");
        movie3.addShowTimings("9pm");

        movie3.setShowTimings(movie3.getShowTimings());

        movieDetails.add(movie3);
        System.out.println(movieDetails.get(2).getMovieName() + "\n" + movieDetails.get(2).getScreen() + "\n" + movieDetails.get(2).getMovieSummary() + "\n" + movieDetails.get(2).getStarCast() + "\n" + movieDetails.get(2).getShowTimings());


        System.out.println(" \n  \t \t ***** Movie 4 *****");
        Movie movie4 = new Movie();

        movie4.setMovieName("Fana");
        movie4.setScreen("Screen 4");
        movie4.setMovieSummary("Love Story");
        movie4.setStarCast("Sharukh Khan, Kajol");
        movie4.setScreenCapacity(5);


        movie4.addShowTimings("10am");
        movie4.addShowTimings("3pm");
        movie4.addShowTimings("7pm");

        movie4.setShowTimings(movie4.getShowTimings());

        movieDetails.add(movie4);
        System.out.println(movieDetails.get(3).getMovieName() + "\n" + movieDetails.get(3).getScreen() + "\n" + movieDetails.get(3).getMovieSummary() + "\n" + movieDetails.get(3).getStarCast() + "\n" + movieDetails.get(3).getShowTimings());


        System.out.println(" \n  \t \t ***** Movie 5 *****");
        Movie movie5 = new Movie();

        movie5.setMovieName("Bajrangi Bhaijaan");
        movie5.setScreen("Screen 1");
        movie5.setMovieSummary("Love Story");
        movie5.setStarCast("Salman Khan, Kareena Kapoor");
        movie5.setScreenCapacity(10);


        movie5.addShowTimings("11am");
        movie5.addShowTimings("5pm");
        movie5.addShowTimings("8pm");

        movie5.setShowTimings(movie5.getShowTimings());

        movieDetails.add(movie5);
        System.out.println(movieDetails.get(4).getMovieName() + "\n" + movieDetails.get(4).getScreen() + "\n" + movieDetails.get(4).getMovieSummary() + "\n" + movieDetails.get(4).getStarCast() + "\n" + movieDetails.get(4).getShowTimings());

    }

    public void listOfMovies() {
        System.out.println("\n Movies playing...");
        for (int i = 0; i < movieDetails.size(); i++) {
            System.out.println(movieDetails.get(i).getMovieName());
        }

    }

    public void showTimings() {

        System.out.println("\n Show timings...");
        for (int i = 0; i < movieDetails.size(); i++) {
            System.out.println("Movie " + movieDetails.get(i).getMovieName() + " playing at " + movieDetails.get(i).getShowTimings());
        }

    }

    public void seatAvailability(Movie movie) {
        System.out.println("Total number of seats available " +movie.getScreenCapacity());
    }


    public boolean seatAvailability(Movie movie,int numberOfTickets) {
        int numberOfSeatsAvailable = 0;

        if(numberOfTickets<movie.getScreenCapacity()) {
            numberOfSeatsAvailable = movie.getScreenCapacity() - numberOfTickets;
            movie.setScreenCapacity(numberOfSeatsAvailable);
            System.out.println("Number of seats available = " + numberOfSeatsAvailable);
            return true;
        }else {
            System.out.println("HouseFull!!");
            return false;
        }
    }

    public boolean cancelTickets(Movie movie,int numberOfTickets) {
        int numberOfSeatsAvailable = 0;

            numberOfSeatsAvailable = movie.getScreenCapacity() + numberOfTickets;
            movie.setScreenCapacity(numberOfSeatsAvailable);
            System.out.println("Number of seats available after cancelling tickets= " + numberOfSeatsAvailable);
            return true;

    }

    public Movie getMovie(String movieName) {
        for (int i = 0; i < movieDetails.size(); i++) {
            if (movieDetails.get(i).getMovieName().equals(movieName)) {
                return movieDetails.get(i);
            }
        }
        return null;
    }

    public void bookTicket(String movieName, String movieTime, int numberOfTickets) {

        for (int i = 0; i < movieDetails.size(); i++) {
            if (movieDetails.get(i).getMovieName().equals(movieName)) {

                for (int j = 0; j < movieDetails.get(i).getShowTimings().size(); j++) {
                    if ((movieDetails.get(i).getShowTimings().get(j).equals(movieTime))) {
                        if (seatAvailability(movieDetails.get(i),numberOfTickets)) {
                            System.out.println("\n Ticket booked for " + movieName + "\t "+ movieTime);
                        } else {
                            System.out.println("\n Ticket not booked");
                        }
                    }
                }
            }
        }
        /*public void cancelReservation(){
         */

    }
}

