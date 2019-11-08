package com.rashmi;

public class Window {
    private int width;
    private int height;
    private String typeOfOpening;

    public Window(int width, int height, String typeOfOpening) {
        this.width = width;
        this.height = height;
        this.typeOfOpening = typeOfOpening;
    }
    public void TypeOfWindow(){
        System.out.println(typeOfOpening);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getTypeOfOpening() {
        return typeOfOpening;
    }
}
