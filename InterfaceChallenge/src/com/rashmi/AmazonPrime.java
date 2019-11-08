package com.rashmi;

import java.util.ArrayList;
import java.util.List;

public class AmazonPrime implements ISaveable {
    String showName;
    String cast;

    public AmazonPrime(String showName, String cast) {
        this.showName = showName;
        this.cast = cast;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "Amazon prime{" +
                "showName='" + showName + '\'' +
                ", cast='" + cast + '\'' +
                '}';
    }

    @Override
    public List writeArraylist() {
        List listOfNames = new ArrayList();
        listOfNames.add(0,this.showName);
        listOfNames.add(1,this.cast);
        return listOfNames;
    }

    @Override
    public void readArrayList(List listOfNames) {
        if(listOfNames != null && listOfNames.size() >0) {
            this.showName = (String) listOfNames.get(0);
            this.cast = (String) listOfNames.get(1);

            /*for (int i = 0; i < listOfNames.size(); i++) {
                System.out.println("Show name " + listOfNames.get(i));
            }*/

        }

    }

}
