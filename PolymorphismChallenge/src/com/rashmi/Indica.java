package com.rashmi;

public class Indica extends Car{


    private String name;
    private String gear;
    private int speed;
    private boolean brake;
    private boolean accelerate;

    public Indica(int speed,  boolean keyIn, String gear,boolean brake,boolean accelerate) {
        super(speed, 5, 4, "Indica", keyIn,brake,accelerate);
        this.gear = gear;
        this.brake = brake;
        this.accelerate = accelerate;

    }


    @Override
    public int speed() {
        System.out.println("Indica");
        return super.speed();
    }

    public String getGear() {
        return gear;
    }
}
