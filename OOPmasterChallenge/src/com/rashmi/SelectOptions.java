package com.rashmi;

import java.util.Scanner;

public class SelectOptions extends BasicHamburger {
    private String chooseBurger = null;
    private String breadRollType = null;
    //private String name;

    public SelectOptions(String breadRollType, String meat,String name) {
        super(breadRollType, meat,name);
    }

    public String selectBurger() {
        System.out.println("Choose a burger \n 1. Basic \n 2. Healthy \n 3. Delux \n");

        Scanner scannerChooseBurger = new Scanner(System.in);
        chooseBurger = scannerChooseBurger.next().toLowerCase();

        if (chooseBurger.equals("basic") || chooseBurger.equals("healthy") || chooseBurger.equals("delux")) {
            chooseBurger.equals(chooseBurger);
        } else {

            while (!chooseBurger.equals("basic") || !chooseBurger.equals("healthy") || !chooseBurger.equals("delux")) {

                System.out.println("Invalid option entered. Select one of the 3 options");

                System.out.println("Choose a burger \n 1. Basic \n 2. Healthy \n 3. Delux \n");
                Scanner scanner1 = new Scanner(System.in);
                chooseBurger = scanner1.next().toLowerCase();
                if (chooseBurger.equals("basic") || chooseBurger.equals("healthy") || chooseBurger.equals("delux")) {
                    chooseBurger.equals(chooseBurger);
                    break;
                }
            }
        }
        return chooseBurger;
    }

    public String selectBread() {


        if (chooseBurger.equals("basic") || chooseBurger.equals("delux")) {
            System.out.println("Select bread roll type \n 1. White \n 2. Brown \n 3. Glutenfree \n");

            Scanner scanner = new Scanner(System.in);
            breadRollType = scanner.next().toLowerCase();
            if (breadRollType.equals("white") || breadRollType.equals("brown") || breadRollType.equals("glutenfree")) {
                super.selectBreadRollType(breadRollType);
            } else {

                while (!breadRollType.equals("white") || !breadRollType.equals("brown") || !breadRollType.equals("glutenfree")) {

                    System.out.println("Invalid option entered. Select one of the 3 options");

                    System.out.println("Select bread roll type \n 1. White \n 2. Brown \n 3. Glutenfree \n");
                    Scanner scanner1 = new Scanner(System.in);
                    breadRollType = scanner1.next().toLowerCase();
                    if (breadRollType.equals("white") || breadRollType.equals("brown") || breadRollType.equals("glutenfree")) {
                        super.selectBreadRollType(breadRollType);
                        break;
                    }
                }
            }
        }
        return breadRollType;
    }

    public String selectMeat() {
        System.out.println("Select meat type \n 1. Chicken \n 2. Bacon \n 3. Beef \n");

        Scanner scannerMeat = new Scanner(System.in);
        String meat = scannerMeat.next().toLowerCase();

        if (meat.equals("chicken") || meat.equals("bacon") || meat.equals("beef")) {
            super.selectMeatType(meat);
        } else {

            while (!meat.equals("chicken") || !meat.equals("bacon") || !meat.equals("beef")) {

                System.out.println("Invalid option entered. Select one of the 3 options");

                System.out.println("Select meat type \n 1. Chicken \n 2. Bacon \n 3. Beef \n");
                Scanner scanner1 = new Scanner(System.in);
                meat = scanner1.next().toLowerCase();
                if (meat.equals("chicken") || meat.equals("bacon") || meat.equals("beef")) {
                    super.selectMeatType(meat);
                    break;
                }
            }
        }
        return meat;
    }

    public void selectAdditionsBasic() {
        int count = 0;

        System.out.println("Select any 4 additions \n 1. Lettuce \n 2. Tomato \n 3. Carrot \n 4. Pickle \n 5. Cucumber \n 6. Spinach \n");
        //count++;
        //numberOfAdditions = numberOfAdditions + count;
        Scanner scannerAdditions = new Scanner(System.in);
        String addition = scannerAdditions.next().toLowerCase();
       /* if (addition.equals("lettuce") || addition.equals("tomato") || addition.equals("carrot") || addition.equals("pickle") || addition.equals("cucumber") || addition.equals("spinach")) {
            //for (int i = 1; i <= 4; i++) {
            count++;
                System.out.println(" \n Addition # " + count + addition);
                super.additions(addition);
            //}
        } {*/

        if (addition.equals("lettuce") || addition.equals("tomato") || addition.equals("carrot") || addition.equals("pickle") || addition.equals("cucumber") || addition.equals("spinach")) {
            count++;

            System.out.println("\n Addition # " + count + addition);
            super.additions(addition);

            if (count == 4) {

                super.totalPriceOfBasicBurger();
                //return;
            }
            System.out.println("Select any 4 additions \n 1. Lettuce \n 2. Tomato \n 3. Carrot \n 4. Pickle \n 5. Cucumber \n 6. Spinach \n");
            addition = scannerAdditions.next().toLowerCase();
        }
        while (!addition.equals("lettuce") || !addition.equals("tomato") || !addition.equals("carrot") || !addition.equals("pickle") || !addition.equals("cucumber") || !addition.equals("spinach")) {


            if (addition.equals("lettuce") || addition.equals("tomato") || addition.equals("carrot") || addition.equals("pickle") || addition.equals("cucumber") || addition.equals("spinach")) {
                count++;

                System.out.println("\n Addition # " + count + addition);
                super.additions(addition);
                System.out.println("Select any 4 additions \n 1. Lettuce \n 2. Tomato \n 3. Carrot \n 4. Pickle \n 5. Cucumber \n 6. Spinach \n");

                if (count == 4) {
                    break;
                }
            } else if (!addition.equals("lettuce") || !addition.equals("tomato") || !addition.equals("carrot") || !addition.equals("pickle") || !addition.equals("cucumber") || !addition.equals("spinach")) {
                System.out.println("Invalid option selected, select one of the following options");
                System.out.println("Select any 4 additions \n 1. Lettuce \n 2. Tomato \n 3. Carrot \n 4. Pickle \n 5. Cucumber \n 6. Spinach \n");
                //  addition = scannerAdditions.next().toLowerCase();
            }
            addition = scannerAdditions.next().toLowerCase();
            //}
            //System.out.println("Select any 4 additions \n 1. Lettuce \n 2. Tomato \n 3. Carrot \n 4. Pickle \n 5. Cucumber \n 6. Spinach \n");

        }
        super.totalPriceOfBasicBurger();
    }

    public void selectAdditionsHealthy() {
        int count = 0;
        HealthyBurger healthyBurger = new HealthyBurger("", "","");

        System.out.println("Select any 6 additions \n 1. Lettuce \n 2. Tomato \n 3. Carrot \n 4. Pickle \n 5. Cucumber \n 6. Spinach \n 7. Onion \n 8. Cheese");

        Scanner scannerAdditions = new Scanner(System.in);
        String addition = scannerAdditions.next().toLowerCase();
        if (addition.equals("lettuce") || addition.equals("tomato") || addition.equals("carrot") || addition.equals("pickle") || addition.equals("cucumber") || addition.equals("spinach") || addition.equals("onion") || addition.equals("cheese")) {
            //for (int i = 1; i <= 6; i++) {
            count++;
            System.out.println("\n  Addition # " + count + addition);
            healthyBurger.additions(addition);

            if (count == 6) {

                healthyBurger.basePriceOfHealthyBurger();
                //return;
            }
            System.out.println("Select any 6 additions \n 1. Lettuce \n 2. Tomato \n 3. Carrot \n 4. Pickle \n 5. Cucumber \n 6. Spinach \n 7. Onion \n 8. Cheese");
            addition = scannerAdditions.next().toLowerCase();

        }
        while (!addition.equals("lettuce") || !addition.equals("tomato") || !addition.equals("carrot") || !addition.equals("pickle") || !addition.equals("cucumber") || !addition.equals("spinach") || !addition.equals("onion") || !addition.equals("cheese")) {


            if (addition.equals("lettuce") || addition.equals("tomato") || addition.equals("carrot") || addition.equals("pickle") || addition.equals("cucumber") || addition.equals("spinach") || addition.equals("onion") || addition.equals("cheese")) {
                count++;


                System.out.println(" \n Addition # " + count + addition);
                healthyBurger.additions(addition);

                if (count == 6) {
                    break;
                }
                System.out.println("Select any 6 additions \n 1. Lettuce \n 2. Tomato \n 3. Carrot \n 4. Pickle \n 5. Cucumber \n 6. Spinach \n 7. Onion \n 8. Cheese");

            } else if (!addition.equals("Lettuce") || !addition.equals("Tomato") || !addition.equals("Carrot") || !addition.equals("Pickle") || !addition.equals("Cucumber") || !addition.equals("Spinach") || !addition.equals("onion") || !addition.equals("cheese")) {
                System.out.println("Invalid option selected, select one of the following options");
                System.out.println("Select any 6 additions \n 1. Lettuce \n 2. Tomato \n 3. Carrot \n 4. Pickle \n 5. Cucumber \n 6. Spinach \n 7. Onion \n 8. Cheese");
            }
            addition = scannerAdditions.next().toLowerCase();
        }
        healthyBurger.totalPriceOfHealthyBurger();
    }

}




/*
        int count =0;
        System.out.println("Select any 4 additions \n 1. Lettuce \n 2. Tomato \n 3. Carrot \n 4. Pickle \n 5. Cucumber \n 6. Spinach \n");

        Scanner scannerAdditions = new Scanner(System.in);
        String addition = scannerAdditions.next().toLowerCase();


        if (addition.equals("Lettuce") || addition.equals("Tomato") || addition.equals("Carrot") || addition.equals("Pickle")|| addition.equals("Cucumber")|| addition.equals("Spinach")) {
                super.additions(addition);
               // break;
        } else {

            while (!addition.equals("Lettuce") || !addition.equals("Tomato") || !addition.equals("Carrot") || !addition.equals("Pickle")|| !addition.equals("Cucumber")|| !addition.equals("Spinach")) {

                System.out.println("Invalid option entered. Select one of the above options");

                System.out.println("Select any 4 additions \n 1. Lettuce \n 2. Tomato \n 3. Carrot \n 4. Pickle \n 5. Cucumber \n 6. Spinach \n");
                Scanner scanner1 = new Scanner(System.in);
                addition = scanner1.next();
               *//* if (addition.equals("lettuce") || addition.equals("tomato") || addition.equals("carrot") || addition.equals("pickle")|| addition.equals("cucumber")|| addition.equals("spinach")) {
                    count++;

                    //for (int i = 1; i <= 4; i++) {
                       // super.additions(addition);
                        System.out.println("Addition # " + count + addition);*//*
                        super.additions(addition);
                        //super.totalPriceOfBasicBurger();

                        //break;
                    //}break;
                }if(count==4){
                    return addition;
                }
            }return addition;

  }*/




