package com.rashmi;

public class HealthyBurger extends BasicHamburger {
    private String breadRollType;
    private int priceAddition1;
    private int priceAddition2;
    private int basePriceOfHealthyBurger;
    private int priceWithAdditions;
    //private  int priceOfAdditions;
    private int superAdditions;
    private int PriceOfHealthyBurger;

    public HealthyBurger(String breadRollType, String meat, String name) {
        super("Brown Rye Bread", meat, name);
        //this.additions = additions;
        this.breadRollType = "Brown Rye Bread";
        //this.priceAddition1 = priceAddition1;
        //this.priceAddition2 = priceAddition2;
       // this.priceWithAdditions = priceWithAdditions;
        //this.priceOfAdditions = priceOfAdditions;
       // this.superAdditions = superAdditions;
       // this.PriceOfHealthyBurger = PriceOfHealthyBurger;
        this.basePriceOfHealthyBurger = 10;
        //this.additions = additions;
    }


    @Override
    public void selectMeatType(String meat) {
         super.selectMeatType(meat);
    }

    @Override
    public int additions(String addition) {

        int priceOfAdditions = 0;

        if (addition.equals("onion")) {
            setOnionPrice();
            priceOfAdditions = priceAddition1;
            System.out.println(" ** Price of onion " + priceOfAdditions);
        } else if (addition.equals("cheese")) {
            setCheesePrice();
            priceOfAdditions = priceAddition2;
            System.out.println(" ** Price of # cheese " + priceOfAdditions);
        } else {
            superAdditions = super.additions(addition);
        }

        priceWithAdditions = priceWithAdditions + priceOfAdditions;

        PriceOfHealthyBurger = superAdditions + priceWithAdditions;

        return (PriceOfHealthyBurger + basePriceOfHealthyBurger);
    }


    public void totalPriceOfHealthyBurger() {
        System.out.println("\n Total price of healthy burger = " + (basePriceOfHealthyBurger + PriceOfHealthyBurger));
    }

    public int basePriceOfHealthyBurger() {
        System.out.println(" ** Base price of healthy burger = " + basePriceOfHealthyBurger);
        return basePriceOfHealthyBurger;
    }

    public void setOnionPrice() {
        this.priceAddition1 = 2;
    }

    public void setCheesePrice() {
        this.priceAddition2 = 1;
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
        */
// return basePriceOfHealthyBurger;