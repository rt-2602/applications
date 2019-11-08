package com.rashmi;

public class Room {
    private Window window;
    private ChristmasTree christmasTree;
    private Tv tv;

    public Room(Window window, ChristmasTree christmasTree, Tv tv) {
        this.window = window;
        this.christmasTree = christmasTree;
        this.tv = tv;
    }

    public void Power(){
        tv.power();
        screen();
    }

    private void screen(){
       tv.HomeScreen();
       tv.Channels();
    }

    public Window getWindow() {
        return window;
    }

    public void lights(){
       christmasTree.lights();
       getChristmasTree();
    }

    private ChristmasTree getChristmasTree() {
        return christmasTree;
    }
}
