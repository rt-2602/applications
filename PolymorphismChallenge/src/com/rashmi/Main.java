package com.rashmi;

public class Main {

    public static void main(String[] args) {
        for(int i=1; i<6;i++){
            Car car = randomCar();
            System.out.println("Car #" +i+
                    ":" +car.getName() + "\n" +
                    "Speed: " +car.speed() + "\n");

        }

    }

    public static Car randomCar(){
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number is " +randomNumber);

        switch (randomNumber){
            case 1:
                return new Altima(40, true, "Automatic",true,true);

            case 2:
                return new Toyota(60, false, "gear",false,true);

            case 3:
                return new Indica(30,true,"gear",false,true);

        }
        return null;
    }

}

