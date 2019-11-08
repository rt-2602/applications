package com.rashmi;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MovieTheater movieTheater = new MovieTheater();

    public static void main(String[] args) {
	// write your code here

        // should give u a menu 1. list of movies 2. show timings 3. seat availability 4. book ticket 5. cancel reservation
        // 1. list of movies should show atleat 5 movies & screen names(screen 1 - capacity 10, 2- cap 8, 3- cap 5, 4- cap 5)
        // 2. show timings should show timings, movie summary and star cast
        // 3. seat availability should when user selects a movie it should show whether seat is availaible. if available book ticket else ask to select diff movie

       // MovieTheater movieTheater = new MovieTheater();
 /*       movieTheater.movieDetails();
        movieTheater.showTimings();
        movieTheater.listOfMovies();

       // movieTheater.seatAvailability("DDLJ","10am");
        movieTheater.bookTicket("DDLJ","10am",2);
        movieTheater.cancelTickets(movieTheater.getMovie("DDLJ"),2);*/

        movieTheater.movieDetails();


        boolean quit = false;
        int choice = 0;
        printMenu();

        while (!quit){
            System.out.println("Enter your choice ");
            choice = scanner.nextInt();
            scanner.nextLine();

            String movieName;
            String movieTime;
            int numberOfTickets;

            switch (choice){
                case 0:
                    movieTheater.listOfMovies();
                    break;

                case 1:
                    System.out.println("Seat availability ");
                    System.out.println("Enter movie name ");
                    movieName = scanner.nextLine();

                    if(movieTheater.getMovie(movieName)!= null ) {
                        movieTheater.seatAvailability(movieTheater.getMovie(movieName));
                    }else{
                        System.out.println("wrong movie name entered");
                    }


                    break;


                case 2:
                    movieTheater.listOfMovies();
                    System.out.println("Enter the name of the movie ");
                    movieName = scanner.nextLine();

                    movieTheater.showTimings();
                    System.out.println("Enter movie time");
                    movieTime = scanner.nextLine();

                    System.out.println("Enter number of tickets to book ");
                    numberOfTickets = scanner.nextInt();

                    if(movieTheater.getMovie(movieName)!= null && movieTheater.getMovie(movieName).getShowTimings().contains(movieTime)) {
                        movieTheater.bookTicket(movieName, movieTime, numberOfTickets);
                    }else{
                        System.out.println("wrong time or movie name entered");
                    }
                    break;


                case 3:
                    System.out.println("Enter the name of the movie to cancel reservation ");
                    movieName = scanner.nextLine();

                    System.out.println("Enter number of tickets to cancel");
                    numberOfTickets = scanner.nextInt();

                    if(movieTheater.getMovie(movieName)!= null) {
                        movieTheater.cancelTickets(movieTheater.getMovie(movieName),numberOfTickets);
                    }else{
                        System.out.println("wrong time or movie name entered");
                    }
                    break;

                case 4:
                    quit = true;
                    break;
            }
            if(!quit){
                printMenu();
            }
        }
    }

    public static void printMenu(){
        System.out.println("\t 0 - list of movies playing");
        System.out.println("\t 1 - seat availability");
        System.out.println("\t 2 - book ticket");
        System.out.println("\t 3 - cancel reservation");
        System.out.println("\t 4 - Quit ");

    }

}
