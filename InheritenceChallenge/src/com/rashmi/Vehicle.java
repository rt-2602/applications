package com.rashmi;

public class Vehicle {
    private int numberOfWheels;
    private int speed;
    private int numberOfSeats;
    private String name;
    private String steering;

    public Vehicle(int numberOfWheels, int speed, int numberOfSeats, String name, String steering) {
        this.numberOfWheels = numberOfWheels;
        this.speed = speed;
        this.numberOfSeats = numberOfSeats;
        this.name = name;
        this.steering =steering;
    }

    public void move(){
       // System.out.println(" speed " +speed);
        if(speed <=20 )
        {
            System.out.println("gear 1, speed " +speed + " : steering= " +steering);
        }else if(speed > 20 && speed <=40 ){
            System.out.println("gear 2 , speed " +speed + " : steering= " +steering);
        }else if(speed >40 && speed<=60){
            System.out.println("gear 3, speed " +speed + " : steering= " +steering);
        }else if(speed >60 && speed<=80){
            System.out.println("gear 4, speed " +speed + " : steering= " +steering);
        }else
            System.out.println("invalid speed");
    }

    public int getNumberOfWheels() {
       return numberOfWheels;
        // System.out.println("number of wheels "+numberOfWheels);
    }

    public int getSpeed() {
        return speed;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getName() {
        return name;
    }
}
