package com.rashmi;

public class Main {

    public static void main(String[] args) {
        String chooseBurger;
        String breadRollType;
        String meat;
       // String addition;

        SelectOptions selectOptions = new SelectOptions("", "","");

        chooseBurger = selectOptions.selectBurger();

        breadRollType = selectOptions.selectBread();

        meat = selectOptions.selectMeat();

        if (chooseBurger.equals("basic")) {
            BasicHamburger basicHamburger = new BasicHamburger(breadRollType, meat,chooseBurger);

            basicHamburger.basePriceOfBasicHamburger();

            selectOptions.selectAdditionsBasic();


        } else if (chooseBurger.equals("healthy")) {

            HealthyBurger healthyBurger = new HealthyBurger(breadRollType, meat,chooseBurger);
            System.out.println(" ** Only Bread roll type available for this burger is " + healthyBurger.getBreadRollType());

            healthyBurger.basePriceOfHealthyBurger();
            selectOptions.selectAdditionsHealthy();

        } else if (chooseBurger.equals("delux")) {
            DeluxHamburger deluxHamburger = new DeluxHamburger(breadRollType, meat,chooseBurger);
            deluxHamburger.basePriceOfDeluxBurger();
            deluxHamburger.drinks();
            deluxHamburger.PriceOfDeluxBurger();
        }
    }
}



        /*basicHamburger.selectBreadRollType(breadRollType);
        System.out.println(basicHamburger.selectMeatType());
        System.out.println(basicHamburger.additions());*/

// Scanner scannerDelux = new Scanner(System.in);
// String delux = scannerDelux.next();
       /* DeluxHamburger deluxHamburger = new DeluxHamburger(breadRollType,meat);
        deluxHamburger.selectMeatType();
        deluxHamburger.selectBreadRollType(breadRollType);
        deluxHamburger.drinks();

         //breadRollType = this.breadRollType;
            //scanner.close();
*/



