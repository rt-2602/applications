package com.rashmi;

//import static jdk.javadoc.internal.doclets.toolkit.util.Utils.toLowerCase;

public class Lights {
    private String pluggedInOrNot;

    public Lights(String pluggedInOrNot) {
        //toLowerCase(pluggedInOrNot);
        this.pluggedInOrNot = pluggedInOrNot.toLowerCase();
        //System.out.println(pluggedInOrNot);
        //System.out.println(this.pluggedInOrNot);
    }

    public boolean isPluggedInOrNot(){


        if(/*(toLowerCase*/(this.pluggedInOrNot).equals("in")){
            return true;
        }else if(/*(toLowerCase*/(this.pluggedInOrNot).equals("out")){
            return false;
        } return false;

    }

    public void isOnorOff() {
        if (isPluggedInOrNot()) {
            System.out.println("Christmas Lights on...");

        } else {
            System.out.println("Lights off...");
        }
    }

    public String getPluggedInOrNot() {
        return pluggedInOrNot;
    }
}


   /* public void isPluggedInOrNot() {
        if((toLowerCase(pluggedInOrNot)=="in")){
            System.out.println("Plugged in...");
        }else if((toLowerCase(pluggedInOrNot)=="out")){
            System.out.println("Plugged out...");
        }
    }*/

   /* public void isOnorOff(String OnorOff) {
        if (toLowerCase(InorOut) =="in") {
            System.out.println("Lights on...");

        } else if(toLowerCase(InorOut) =="out"){
            System.out.println("Lights off...");
        }
    }*/

