package com.rashmi;

import java.util.ArrayList;

public class Movie {

    private ArrayList<String> moviesRunning = new ArrayList<String>();
    private ArrayList<String> showTimings = new ArrayList<>();

    private String movieName;
    private String starCast;
    private  String movieSummary;
    private String screen;
    private int screenCapacity;
    private int seatAvailability;


    public void addShowTimings(String time){
        MovieTimings movieTimings = new MovieTimings();
        showTimings.add(time);
    }

    public ArrayList<String> getMoviesRunning() {
        return moviesRunning;
    }

    public void setMoviesRunning(ArrayList<String> moviesRunning) {
        this.moviesRunning = moviesRunning;
    }

    public ArrayList<String> getShowTimings() {
        return showTimings;
    }

    public void setShowTimings(ArrayList<String> showTimings) {
        this.showTimings = showTimings;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getStarCast() {
        return starCast;
    }

    public void setStarCast(String starCast) {
        this.starCast = starCast;
    }

    public String getMovieSummary() {
        return movieSummary;
    }

    public void setMovieSummary(String movieSummary) {
        this.movieSummary = movieSummary;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public int getScreenCapacity() {
        return screenCapacity;
    }

    public void setScreenCapacity(int screenCapacity) {
        this.screenCapacity = screenCapacity;
    }

    public int getSeatAvailability() {
        return seatAvailability;
    }

    public void setSeatAvailability(int seatAvailability) {
        this.seatAvailability = seatAvailability;
    }
}
