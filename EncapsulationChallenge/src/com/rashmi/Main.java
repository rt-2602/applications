package com.rashmi;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(5,true);
	    printer.fillUpToner();
	    printer.printingPage();

        System.out.println("***************************************");
        Printer printer1 = new Printer(20,false);
        printer1.fillUpToner();
        printer1.printingPage();
    }
}
