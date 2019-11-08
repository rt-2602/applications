package com.rashmi;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted ;
    private boolean duplexOrNot;

    public Printer(int tonerLevel, boolean duplexOrNot) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted =0;
        this.duplexOrNot = duplexOrNot;
    }

    public void fillUpToner(){
        if(tonerLevel >100 || tonerLevel <0) {
            System.out.println("Invalid number... Enter number between 1 and 100");
        }
          else  if (tonerLevel < 10) {
                System.out.println("Toner level " + tonerLevel);
                tonerLevel = 100 - tonerLevel;
                System.out.println("Filling up toner " + tonerLevel);
            } else {
                System.out.println("Toner level greater than minimum, toner will be refilled when level less than 10");
            }

    }

    public void printingPage(){
        int pagesPrinted = numberOfPagesPrinted;
        this.numberOfPagesPrinted+=pagesPrinted ;

        System.out.println("Number of pages printed " +pagesPrinted);
        duplexOrNot(duplexOrNot);
    }

    public void duplexOrNot(boolean duplexOrNot){
        if(duplexOrNot){
            System.out.println("Duplex printer");
        }else{
            System.out.println("Not duplex printer");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexOrNot() {
        return duplexOrNot;
    }
}
