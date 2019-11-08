package com.rashmi;

/* adds a set of items to a linked list and iterates through the list. for example you can find items 
 * previous item to current item, next item to current item, add item, delete item, compare- checks if item is available in the list*/

public class Main {

    public static void main(String[] args) {

        LinkedListClass linkedListClass = new LinkedListClass("Darwin");
        linkedListClass.addItemstoList();        
        linkedListClass.nextItem();
        linkedListClass.previouItem();
        linkedListClass.deletCurrentItem();
        linkedListClass.compare();
        //linkedListClass.addToList();

       // linkedListClass.list();
    }
}
