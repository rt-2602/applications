package com.rashmi;

public class Screen {
    private String model;
    private String manufacturer;
   // private String channels;
   // private String homeScreen;

    public Screen(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
       // this.channels = channels;
      //  this.homeScreen = homeScreen;
    }




    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    /*public String getChannels() {
        return channels;
    }

    public String getHomeScreen() {
        return homeScreen;
    }*/
}
