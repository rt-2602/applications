package com.rashmi;

import java.util.Scanner;

public class BasicHamburger {
    private String breadRollType;
    private String meat;
    private String name;
    private int lettucePrice;
    private int tomatoPice;
    private int carrotPrice;
    private int picklePrice;
    private int cucumberPrice;
    private int spinachPrice;
    private int basePriceWithoutAdditions;
    private int priceWithAdditions;
    // private int basePriceOfBasicHamburger;


    public BasicHamburger(String breadRollType, String meat,String name) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePriceWithoutAdditions = 8;
       // this.priceWithAdditions = priceWithAdditions;
    }

    public void selectBreadRollType(String breadRollType) {

        //System.out.println("Selected Bread roll type " + breadRollType);

        switch (breadRollType) {

            case "white":
                System.out.println("Selected Bread roll type " + breadRollType);
                break;
            case "brown":
                System.out.println("Selected Bread roll type " + breadRollType);
                break;
            case "glutenfree":
                System.out.println("Selected Bread roll type " + breadRollType);
                break;
            default:
                System.out.println("Invalid type entered, enter one of the three options");

        }

    }

    public void selectMeatType(String meat) {

        switch (meat) {

            case "chicken":
                System.out.println("Selected Meat type " + meat);
                break;
            case "bacon":
                System.out.println("Selected Meat type " + meat);
                break;
            case "beef":
                System.out.println("Selected Meat type " + meat);
                break;
            default:
                System.out.println("Invalid type entered, enter one of the three options");
        }
    }

    public int additions(String addition) {
        int priceOfAdditions = 0;

        if (addition.equals("lettuce")) {
            setLettucePrice();
            priceOfAdditions = lettucePrice;
            System.out.println(" ** Price of # lettuce = " + priceOfAdditions);
        } else if (addition.equals("tomato")) {
            setTomatoPice();
            priceOfAdditions = tomatoPice;
            System.out.println(" ** Price of # tomato = " + priceOfAdditions);
        } else if (addition.equals("carrot")) {
            setCarrotPrice();
            priceOfAdditions = carrotPrice;
            System.out.println(" ** Price of # carrot = " + priceOfAdditions);
        } else if (addition.equals("pickle")) {
            setPicklePrice();
            priceOfAdditions = picklePrice;
            System.out.println(" ** Price of # pickle = " + priceOfAdditions);
        } else if (addition.equals("cucumber")) {
            setCucumberPrice();
            priceOfAdditions = cucumberPrice;
            System.out.println(" ** Price of # cucumber = " + priceOfAdditions);
        } else if (addition.equals("spinach")) {
            setSpinachPrice();
            priceOfAdditions = spinachPrice;
            System.out.println(" ** Price of # spinach = " + priceOfAdditions);
        }
        priceWithAdditions = priceWithAdditions + priceOfAdditions;

        return priceWithAdditions;
    }

    public int totalPriceOfBasicBurger() {
        System.out.println(" \n Total price of hamburger with additions " + (basePriceWithoutAdditions + priceWithAdditions));
        return (basePriceWithoutAdditions + priceWithAdditions);
    }

    public int basePriceOfBasicHamburger() {
        System.out.println("Base price of basic hamburger = " + basePriceWithoutAdditions);
        return basePriceWithoutAdditions;
    }

    public void setLettucePrice() {
        this.lettucePrice = 2;
    }

    public void setTomatoPice() {
        this.tomatoPice = 4;
    }

    public void setCarrotPrice() {
        this.carrotPrice = 3;
    }

    public void setPicklePrice() {
        this.picklePrice = 1;
    }

    public void setCucumberPrice() {
        this.cucumberPrice = 2;
    }

    public void setSpinachPrice() {
        this.spinachPrice = 3;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

}




/*  String addition1 =scanner.next();
        count++;
        int numberOfAdditions = 0;
               numberOfAdditions= numberOfAdditions +count;
        System.out.println("Additions chosen 1 " +addition1);

        Scanner scanner1 = new Scanner(System.in);
        String addition2 =scanner.next();
        System.out.println("Additions chosen 1 " +addition2);

        Scanner scanner2 = new Scanner(System.in);
        String addition3 =scanner.next();
        System.out.println("Additions chosen 1 " +addition3);

        Scanner scanner3 = new Scanner(System.in);
        String addition4 =scanner.next();
        System.out.println("Additions chosen 1 " +addition4);

        Scanner scanner4 = new Scanner(System.in);
        String addition5 =scanner.next();
        System.out.println("Additions chosen 1 " +addition5);

         // basePriceWithoutAdditions = basePriceWithoutAdditions + priceWithAdditions;
        //int totalPrice = priceOfAdditions + basePriceWithoutAdditions;
       // System.out.println("Total price of hamburger with additions " +(priceWithAdditions+basePriceWithoutAdditions));
        */