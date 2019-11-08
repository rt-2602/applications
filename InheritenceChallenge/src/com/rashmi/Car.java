package com.rashmi;

public class Car extends Vehicle {
    private String steering;
    //private int gear;


    public Car(int numberOfWheels, int speed, int numberOfSeats, String name, String steering) {
        super(numberOfWheels, speed, numberOfSeats, name, steering);
        this.steering = steering;

    }

    public String getSteering() {
        return steering;
    }

  /*  public int getGear() {
        return gear;
    }
*/

    @Override
    public void move() {
        super.move();
    }


}
