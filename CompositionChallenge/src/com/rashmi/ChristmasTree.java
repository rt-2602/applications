package com.rashmi;

public class ChristmasTree {
    private int height;
    private String typeOfTree;
    private Lights lights;

    public ChristmasTree(int height, String typeOfTree, Lights lights) {
        this.height = height;
        this.typeOfTree = typeOfTree;
        this.lights = lights;
    }

    public void lights(){
        lights.isPluggedInOrNot();
        lights.isOnorOff();
    }

    public int getHeight() {
        return height;
    }

    public String getTypeOfTree() {
        return typeOfTree;
    }

    public Lights getLights() {
        return lights;
    }
}
