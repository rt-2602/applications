package com.rashmi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Netflix netflix = new Netflix("Friends", "Joey, Rachel...");
        System.out.println(netflix.toString());
        saveObject(netflix);

        System.out.println("\n================================================\n");

        netflix.setShowName("F.R.I.E.N.D.S");
        netflix.setCast("Chandler, Monica...");
        saveObject(netflix);
        loadObject(netflix);
        System.out.println(netflix);

        System.out.println("\n================================================\n");
        Netflix netflix1 = new Netflix("hello", "Joey, Rachel..");
        System.out.println(netflix1.toString());
        saveObject(netflix1);

        System.out.println("\n================================================\n");

        AmazonPrime amazonPrime = new AmazonPrime("harry potter", "Daniel Radcliff...");
        System.out.println(amazonPrime.toString());
        saveObject(amazonPrime);

        System.out.println("\n================================================\n");

        amazonPrime.setShowName("HARRY POTTER");
        amazonPrime.setCast("Daniel Radcliff, Ron...");
        saveObject(amazonPrime);
        loadObject(amazonPrime);
        System.out.println(amazonPrime);

        System.out.println("\n================================================\n");
        AmazonPrime amazonPrime1 = new AmazonPrime("123", "456..");
        System.out.println(amazonPrime1.toString());
        saveObject(amazonPrime1);



    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n  " +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter 2 strings: for show name and cast ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for (int i=0; i<objectToSave.writeArraylist().size();i++){
            System.out.println("Storing " + objectToSave.writeArraylist().get(i) + " to storage device...");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values =readValues();
        objectToLoad.readArrayList(values);
    }
}
