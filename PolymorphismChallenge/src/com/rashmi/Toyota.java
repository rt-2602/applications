package com.rashmi;

public class Toyota extends Car {

    private String gear;
    private boolean brake;
    private boolean accelerate;

    public Toyota(int speed, boolean keyIn, String gear,boolean brake,boolean accelerate) {
        super(speed, 5, 4, "Toyota", keyIn,brake,accelerate);

        this.gear = gear;
        this.brake = brake;
        this.accelerate = accelerate;
    }

    @Override
    public int speed() {
        System.out.println("Toyota");
       return super.speed();
    }


    public String getGear() {
        return gear;
    }
}
