package com.rashmi;

public class Altima extends Car {
    private String gear;
     private boolean brake;
    private boolean accelerate;


    public Altima(int speed, boolean keyIn, String gear,boolean brake,boolean accelerate) {
        super(speed, 5, 6, "Altima", keyIn,brake,accelerate);
        this.gear = gear;
        this.brake = brake;
        this.accelerate = accelerate;

    }



    public void speed(int speed) {
        System.out.println("Altima" +"gear" +gear);
    }

    public String getGear() {
        return gear;
    }




}
