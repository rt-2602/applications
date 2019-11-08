package com.rashmi;

public class Altima extends Vehicle {
    private String bluetooth;
    private String smartKey;
    private String autoLock;

    public Altima(int numberOfWheels, int speed, int numberOfSeats, String name, String steering, String bluetooth, String smartKey, String autoLock) {
        super(numberOfWheels, speed, numberOfSeats, name, steering);
        this.bluetooth = bluetooth;
        this.smartKey = smartKey;
        this.autoLock = autoLock;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public String getSmartKey() {
        return smartKey;
    }

    public String getAutoLock() {
        return autoLock;
    }

    public void additionalFeatures(){
        System.out.println("Additional features, bluetooth= " +bluetooth +" : smartKey= "+ smartKey+" :  autolock= " + autoLock);
    }

    @Override
    public void move() {
        super.move();
    }
}
