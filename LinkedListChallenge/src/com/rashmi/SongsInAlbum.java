package com.rashmi;

import java.util.ArrayList;
import java.util.Scanner;

public class SongsInAlbum {
    Scanner scanner = new Scanner(System.in);

    Album album = new Album();
    ArrayList<Album> listOfAlbums = new ArrayList<Album>();

    public void addNewSongToList(String name, String duration){
        Song song = new Song();
        song.setSongTitle(name);
        song.setSongDuration(duration);
        album.getArrAlbum().add(song);
    }

    public ArrayList<Song> listOfSongs(){
        Song song1 = new Song();
        song1.setSongTitle("soch na sake");
        song1.setSongDuration("5.00");
        album.getArrAlbum().add(song1);

        Song song2 = new Song();
        song2.setSongTitle("tu na jane as pass he khud");
        song2.setSongDuration("4.50");
        album.getArrAlbum().add(song2);

        Song song3 = new Song();
        song3.setSongTitle("desi girl");
        song3.setSongDuration("4.00");
        album.getArrAlbum().add(song3);

        Song song4 = new Song();
        song4.setSongTitle("gulabi aankhe");
        song4.setSongDuration("4.50");
        album.getArrAlbum().add(song4);

        Song song5 = new Song();
        song5.setSongTitle("dil diyan gallan");
        song5.setSongDuration("5.01");
        album.getArrAlbum().add(song5);

        Song song6 = new Song();
        song6.setSongTitle("paisa");
        song6.setSongDuration("4.59");
        album.getArrAlbum().add(song6);

        Song song7 = new Song();
        song7.setSongTitle("hangover");
        song7.setSongDuration("5.05");
        album.getArrAlbum().add(song7);

        Song song8 = new Song();
        song8.setSongTitle("chittiyan kalaiyan");
        song8.setSongDuration("4.50");
        album.getArrAlbum().add(song8);

        Song song9 = new Song();
        song9.setSongTitle("paani da");
        song9.setSongDuration("4");
        album.getArrAlbum().add(song9);

        return album.getArrAlbum();

    }

    public void printSongs(){
        //listOfSongs();

        System.out.println("\n Songs available  \n");
        for(int i=0; i<album.getArrAlbum().size();i++){
            System.out.println((i+1) + "\t Song name = " + album.getArrAlbum().get(i).getSongTitle() +"\n\t\t duration = " +album.getArrAlbum().get(i).getSongDuration()+ "\n");
        }
    }

    public void createAlbum(){
        printSongs();
        Album album1 = new Album();
        createAlbum(album1);
    }

    public Album findAlbumName(String name){
        for (Album checkedName : listOfAlbums){
            if(checkedName.getAlbumName().equals(name)){
                return checkedName;
            }
        }
        return null;
    }

    private void createAlbum(Album album1) {
        int count = 0;
        String name;
        boolean flag = false;

       while(flag == false) {
           System.out.println("Enter the name of album");
           name = scanner.next();

            if (findAlbumName(name) == null) {
                album1.setAlbumName(name);
                flag = true;
                break;
            } else {
                System.out.println("Album name already exists, choose different name ");
                flag=false;
                continue;
            }
        }
        /*for(Album checkedAlbum : listOfAlbums) {
            if(checkedAlbum.getAlbumName().equals(name)){
                System.out.println("Name already exists");
            }else {
                album1.setAlbumName(name);
            }
        }*/
        System.out.println("\n Select any 4 songs from above list to create album. Enter the number ");

        while (count < 4) {
            count++;
            int option = scanner.nextInt();
            int size = album.getArrAlbum().size();
            if (option <= size) {
                album1.getArrAlbum().add(album.getArrAlbum().get(option - 1));
            } else {
                count--;
                System.out.println("selected number does'nt exist, select the numbers from list");
            }
        }

            System.out.println("\n Album created with... \n\t name = " + album1.getAlbumName());
            System.out.println("\n\t following songs are added to the album... \t");
            for (int i = 0; i < album1.getArrAlbum().size(); i++) {
                System.out.println("\t\t " + album1.getArrAlbum().get(i).getSongTitle() + "\t\t" + album1.getArrAlbum().get(i).getSongDuration());
            }

            listOfAlbums.add(album1);
boolean flag1 = false;
            while(flag1==false) {
                System.out.println("\n Create another album? Enter \n\t 0  -for yes, \n\t 1 - to quit");
                int select = scanner.nextInt();
                if (select == 0) {
                    createAlbum();
                    flag1=true;
                } else if (select == 1) {
                    return;
                } else {
                    System.out.println("Wrong option selected. Enter 0 or 1!! ");
                    flag1=false;
                    continue;
                }
            }
        }



    public void albumsCreated() {
        //Album album1 = new Album();
        //System.out.println("Album name = " +album1.getAlbumName());
        for(int i=0;i<listOfAlbums.size();i++) {

            System.out.println("\n Album name = " +listOfAlbums.get(i).getAlbumName());

            for (int j=0;j<listOfAlbums.get(i).getArrAlbum().size();j++){
                System.out.println((j+1)+ "\t song name = "+listOfAlbums.get(i).getArrAlbum().get(j).getSongTitle() +"\n\t\t duration = "+ listOfAlbums.get(i).getArrAlbum().get(j).getSongDuration() +"\n");
            }
        }
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public ArrayList<Album> getListOfAlbums() {
        return listOfAlbums;
    }

    public void setListOfAlbums(ArrayList<Album> listOfAlbums) {
        this.listOfAlbums = listOfAlbums;
    }
}
