package com.game;

import java.util.ArrayList;
import java.util.Random;

public class Game {

    int randomNo;
    static int counter;

    public ArrayList ladderArraylist(){

         ArrayList<Integer> ladderArrayList = new ArrayList<>();
        ladderArrayList.add(6);
        ladderArrayList.add(11);
        ladderArrayList.add(16);
        ladderArrayList.add(33);
        ladderArrayList.add(41);

        return ladderArrayList;
    }

    public ArrayList snakeArraylist() {

        ArrayList<Integer> snakeArrayList = new ArrayList<>();

        snakeArrayList.add(20);
        snakeArrayList.add(26);
        snakeArrayList.add(31);
        snakeArrayList.add(60);
        snakeArrayList.add(63);

        return snakeArrayList;

    }


    public int generateRandomnNum(){
        Random randomNum = new Random();
        randomNo = randomNum.nextInt(7-1 +1) +1;

        return randomNo;
    }

    public void startGame() {

        System.out.println("Game started...");

        while (counter <= 64) {

            String msg = "";
            generateRandomnNum();

            System.out.println("Dice value: " +randomNo);

            int value = counter + randomNo;

            if (value <= 64) {
                if (snakeArraylist().contains(value) ) {

                    msg = "Snake bite;";

                    if (value == 20) {
                        counter = value - 18; // go down
                    } else if (value == 26) {
                        counter = value - 2;
                    } else if (value == 31) {
                        counter = value - 12;
                    } else if (value == 60) {
                        counter = value - 4;
                    } else if (value == 63) {
                        counter = value - 25;
                    }
                } else if (ladderArraylist().contains(value) ) {

                    msg = "Ladder climb;";

                    if (value == 6) {
                        counter = value + 55; // go up
                    } else if (value == 11) {
                        counter = value + 14;
                    } else if (value == 16) {
                        counter = value + 16;
                    } else if (value == 33) {
                        counter = value + 17;
                    } else if (value == 41) {
                        counter = value + 17;
                    }

                } else {
                    counter += randomNo;
                }

                System.out.println(msg+" You are at  "+counter);

                if (counter == 64) {

                    System.out.println("Game over!!! You win!!");
                    break;

                }

            }
        }


    }

}


