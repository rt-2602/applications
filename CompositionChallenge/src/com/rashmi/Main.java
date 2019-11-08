package com.rashmi;

public class Main {

    public static void main(String[] args) {
    Window window = new Window(10,10,"Sliding");

     ChristmasTree christmasTree = new ChristmasTree(7,"coniferace", new Lights("in"));

        Tv tv = new Tv(25,10,10,new Screen("2018A","Sharp"),true);

        Room room = new Room(window,christmasTree,tv);

        room.Power();

        room.getWindow().TypeOfWindow();

        room.lights();


    }
}
