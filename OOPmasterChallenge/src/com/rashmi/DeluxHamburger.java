package com.rashmi;

import java.util.Scanner;

public class DeluxHamburger extends BasicHamburger {
    private String addition1;
    private String addition2;
    private int basePriceOfDeluxBurger;
   // private int PriceOfDeluxBurger;
    private int addition1Price;
    private int addition2Price;
    private String name;

    public DeluxHamburger(String breadRollType, String meat,String name) {
        super(breadRollType, meat,name);
        this.addition1 = "Chips";
        this.addition2 = "Drink";
        this.basePriceOfDeluxBurger = 10;
        this.addition1Price = 4;
        this.addition2Price = 5;
    }

    @Override
    public void selectBreadRollType(String breadRollType) {
        super.selectBreadRollType(breadRollType);
    }

    @Override
    public void selectMeatType(String meat) {
         super.selectMeatType(meat);
    }

    public int basePriceOfDeluxBurger() {
        return basePriceOfDeluxBurger = 10;
    }

    public void drinks() {
        System.out.println(" ** 2 additions with this burger include \n 1. " + addition1 + " Price =" + addition1Price + "\n 2. " + addition2 + "Price = " + addition2Price);
        System.out.println(" ** Base price of burger = " + basePriceOfDeluxBurger);
        System.out.println("\n Select a drink \n 1. Coke \n 2. Pepsi \n 3. Fanta");
        Scanner scanner = new Scanner(System.in);
        String drink = scanner.next().toLowerCase();

        while(!drink.equals("coke") || !drink.equals("pepsi") || !drink.equals("fanta")){

            if(drink.equals("coke") || drink.equals("pepsi") || drink.equals("fanta")){
                System.out.println("Drinks selected " + drink);
                break;
            }
            else if(!drink.equals("coke") || !drink.equals("pepsi") || !drink.equals("fanta")) {
                System.out.println("Invalid option entered, select one of the following options ");
                System.out.println("\n Select a drink \n 1. Coke \n 2. Pepsi \n 3. Fanta");
                scanner = new Scanner(System.in);
                //scanner.next();

            }drink = scanner.next().toLowerCase();
        }
        scanner.close();
    }

    public void PriceOfDeluxBurger() {
        int PriceOfDeluxBurger = basePriceOfDeluxBurger + addition1Price + addition2Price;
        System.out.println("\n Total price of Delux burger = " + PriceOfDeluxBurger);

    }
}
