package com.rashmi;

import java.util.ArrayList;

public class Customers {
    String name;
    ArrayList<Double> arTransactions = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getArTransactions() {
        return arTransactions;
    }

    public void setArTransactions(ArrayList<Double> arTransactions) {
        this.arTransactions = arTransactions;
    }
}
