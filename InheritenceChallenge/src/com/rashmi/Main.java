package com.rashmi;

public class Main  {

    public static void main(String[] args) {
	 Vehicle vehicle = new Vehicle(4,20,4,"indica","right");
    vehicle.move();

    Car car = new Car(4,40,5,"swift","left" );
    car.move();

    Altima altima = new Altima(4,60,5,"Altima","center","yes","yes","yes");
    altima.additionalFeatures();
    altima.move();
        System.out.println(altima.getAutoLock());


    }
}
