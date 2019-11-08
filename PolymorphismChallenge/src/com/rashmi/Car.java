package com.rashmi;

public class Car {
    private int doors;
    private boolean engine;
    private int engineNumberOfCylinder;
    private int wheels;
    private String name;
    private boolean keyIn;
    private int gear;
    private int speed;
    private boolean brake;
    private boolean accelerate;


    public Car(int speed,int doors, int engineNumberOfCylinder, String name, boolean keyIn,boolean brake,boolean accelerate) {
        this.doors = doors;
        this.engine = true;
        this.engineNumberOfCylinder = engineNumberOfCylinder;
        this.wheels = 4;
        this.name = name;
        this.keyIn = keyIn;
        this.gear = gear;
        this.speed = speed;
        this.brake =brake;
        this.accelerate = accelerate;

    }

    public String startEngine(boolean keyIn){
        if(this.keyIn){
            return "Press button to start engine";
           // System.out.println("Press button to start engine");
        }else {
            return "No key";
           // System.out.println("No key");
        }
    }

    public  void accelerate(){
       if(this.keyIn){
           if(accelerate ) {
               System.out.println("accelerator pressed to increase speed");
               if(brake ==true){
                   System.out.println("brake pressed ,cannot increase speed ");
               }
           }else{
               System.out.println("accelerator not pressed");
           }
       } else{
           System.out.println("engine not on");
       }

    }

    public void brake(){
        if(this.keyIn){
            if(brake) {
                System.out.println("brake pressed to stop");
            }else{
                System.out.println("brake not pressed");
            }
        }else{
            System.out.println("engine not on");
        }
    }

    public int speed(){

        startEngine(keyIn);
        accelerate();
        brake();
       if(keyIn) {
           if (speed >= 0 && speed <= 100) {
               if (speed > 0 && speed <= 20) {
                   gear = 1;
                   System.out.println("Gear " + this.gear);
               } else if (speed > 20 && speed <= 40) {
                   gear = 2;
                   System.out.println("Gear " + this.gear);
               } else if (speed > 40 && speed <= 60) {
                   gear = 3;
                   System.out.println("Gear " + this.gear);
               } else if (speed > 60 && speed <= 80) {
                   gear = 4;
                   System.out.println("Gear " + this.gear);
               } else if (speed > 80 && speed <= 100) {
                   gear = 5;
                   System.out.println("Gear " + this.gear);
               }
           } else {
               System.out.println("Invalid number speed should be between 0 and 100");
           }
           return speed;
       }else System.out.println("engine not on");
       return 0;
    }


    public int getDoors() {
        return doors;
    }

    public int getEngineNumberOfCylinder() {
        return engineNumberOfCylinder;
    }

    public String getName() {
        return name;
    }
}
