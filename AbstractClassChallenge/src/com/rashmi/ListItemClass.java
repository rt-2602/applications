package com.rashmi;


import java.util.ArrayList;

public abstract class ListItemClass {
   // List arrList;
    String searchItem;
    int indexOfSearchItem;
    int currentPosition = indexOfSearchItem;
    int indexOfNextItem;
    int indexOfPreviousitem;
    ArrayList list;
    ListItemClass listItem;
    String arrList[];
    protected ListItemClass leftLink = null;
    protected  ListItemClass rightLink = null;
    protected Object value;




    public ListItemClass(String searchItem) {
        this.searchItem = searchItem;
        this.list = new ArrayList();
       // this.arrList = new ArrayList();
    }

    public int getIndex(String searchItem) {
        for (int i = 0; i < arrList.length; i++) {
            if (arrList[i] == null) {
                continue;
            }
            if (arrList[i].contains(searchItem)) {
                indexOfSearchItem = i;
                return indexOfSearchItem;
            }else {
                System.out.println("Search itemToAdd not found");
                break;
            }
            } return indexOfSearchItem;
        }


    public String nextItem(){
        int position = getIndex(searchItem);
        indexOfNextItem = position + 1;
        if(indexOfNextItem<arrList.length) {
            System.out.println(" Next item = " + arrList[indexOfNextItem]);
            return arrList[indexOfNextItem];
        }else{
            System.out.println(" Reached end of list, no next itemToAdd available!! ");
        }
        return " Reached end of list!! ";

    }
    
    public String previouItem(){
        int position = getIndex(searchItem);
        if(position >= 0) {
            indexOfPreviousitem = position - 1;
            if(indexOfPreviousitem >=0 ) {
                System.out.println(arrList[indexOfPreviousitem]);
                return arrList[indexOfPreviousitem];
            }else{
                System.out.println(" Reached end of list, no previous itemToAdd available!! ");
            }
        }
        return "Reached end of list";

    }

    public void deletCurrentItem(){
        int position = getIndex(searchItem);
        if(position >= 0) {
            System.out.println("Item to delete " +searchItem);
                arrList[position] = null;
                System.out.println("Deleted search item, updated list " );
                printArray(arrList);
               // return arrList[indexOfPreviousitem];
            }else{
                System.out.println(" Reached end of list, no previous itemToAdd available!! ");
            }
        }


        public void printArray(String[] arrList){
            for (int i=0;i<arrList.length;i++){
                System.out.println(arrList[i]);
            }
        }

        public int compare(){
        for (int i=0; i<arrList.length;i++){
            if(arrList[i] ==null){
                continue;
            }
            if(arrList[i].compareTo(searchItem)==0){
                System.out.println(searchItem +" Item already available in the list, returning 0");
                return 0;
            }else if(arrList[i].compareTo(searchItem) > 0){
                System.out.println(searchItem + " Not available. Returning > 0");
                return arrList[i].compareTo(searchItem);
            }else if(arrList[i].compareTo(searchItem) < 0){
                System.out.println(searchItem + " Not available. Returning < 0");
                return arrList[i].compareTo(searchItem);
            }else {
                System.out.println("Could'nt compare " +searchItem);
            }
        }
        return 007;
        }



    public void moveNext(){
        currentPosition = currentPosition+1;
        System.out.println(" moved next to " +currentPosition);
    }
    public void moveBack(){
        currentPosition = currentPosition - 1;
        System.out.println(" moved back to " +currentPosition);
    }
    public boolean searchItem(String searchItem){
        for (int i=0;i<arrList.length;i++){
            if(arrList[i].contains(searchItem)){
                return true;
            }else return false;
        }return false;
    }

    public void addItemstoList(){
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney";

        arrList = stringData.split(" ");
        for (String s : arrList){

            System.out.println(s);
        }

    }

    public abstract void addItemsToList(String item);

    @Override
    public String toString() {
        return "ListItemClass{" +
                "currentPosition=" + currentPosition +
                ", indexOfNextItem=" + indexOfNextItem +
                ", indexOfPreviousitem=" + indexOfPreviousitem +
                '}';
    }



    public int getIndexOfNextItem() {
        return indexOfNextItem;
    }

    public int getIndexOfPreviousitem() {
        return indexOfPreviousitem;
    }


    public int getIndexOfSearchItem() {
        return indexOfSearchItem;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }
}
