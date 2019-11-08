package com.rashmi;

import java.util.ArrayList;

public class LinkedListClass extends ListItemClass{

    String itemToAdd;
    ArrayList list;

    public LinkedListClass(String searchItem) {
        super(searchItem);
        this.itemToAdd = itemToAdd;
    }


    @Override
    public void addItemsToList(String item) {
        previouItem();
        nextItem();


    }
}
