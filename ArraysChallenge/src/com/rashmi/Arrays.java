package com.rashmi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

       /* for (int i = 0; i < returnedArray.length; i++){
            System.out.println("Entered number at position " + i + " = " +returnedArray[i]);
         }*/
        int [] returnedArray = getArray(5);
        printArray(returnedArray);

        System.out.println("\n ***** Sorted numbers ***** \n");
        printArray(sortArray(returnedArray));

    }

    public static int[] getArray(int number){
        System.out.println("Enter " +number+ " integers \r");
        int[] enteredArray = new int[number];

        for (int i=0; i< enteredArray.length;i++){
            enteredArray[i] = scanner.nextInt();
        }
        return enteredArray;
    }

    public static void printArray(int [] returnedArray){
        //int[] returnedArray = getArray(5);
        for (int i = 0; i < returnedArray.length; i++){
            System.out.println("Entered number at position " + i + " = " +returnedArray[i]);
        }
    }

    public static int[] sortArray(int[] enteredArray){

        int [] sortedArray = Arrays.copyOf(enteredArray,enteredArray.length);

      /*  boolean flag = true;
        int temp;

        while (flag){
            flag = false;

            for (int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;

                    flag = true;
                }
            }
        }*/


        for(int i=0;i<enteredArray.length;i++){
            for(int j=i+1;j<enteredArray.length;j++){
                if(enteredArray[i]<enteredArray[j]){
                    int temp = enteredArray[i];
                    enteredArray[i]=enteredArray[j];
                    enteredArray[j]=temp;
                    //break;
                }
            }
        }
        return enteredArray;

        //return sortedArray;
    }


}
