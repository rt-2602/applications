package com.rashmi;

public class Tv {
    private int size;
    private int width;
    private int height;
    private Screen screen;
    private boolean PowerButtonPressed;

    public Tv(int size, int width, int height, Screen screen, boolean powerButtonPressed) {
        this.size = size;
        this.width = width;
        this.height = height;
        this.screen = screen;
        this.PowerButtonPressed = powerButtonPressed;
    }

    public void power(){
        if(PowerButtonPressed){
        System.out.println("Power on...Tv ON...");
        }
        else {
            System.out.println("Tv OFF...");
        }
    }
    public void HomeScreen(){
        System.out.println("HomeScreen displays Happy new year");
    }

    public void Channels(){
        System.out.println("Channel 1 Netflix");
        System.out.println("Channel 2 Youtube");
    }


    public int getSize() {
        return size;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public  Screen getTvCase() {
        return screen;
    }
}
