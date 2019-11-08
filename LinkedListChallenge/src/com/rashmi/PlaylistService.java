package com.rashmi;

import java.util.*;

public class PlaylistService {

    Playlist playlist = new Playlist();

    LinkedList<Song> playListSongs = new LinkedList<Song>();
    boolean goingForward = true;
    String current;
    Set<Song> playlistSet = new HashSet<Song>();
    Boolean playlistStarted = false;



    public void skipForwardToNextSong(){
        skipForwardToNextSong(playListSongs);
    }

    private void skipForwardToNextSong(LinkedList playListSongs){
        ListIterator<Song> listIterator = playListSongs.listIterator();



        if(playListSongs.isEmpty()){
            System.out.println("No songs");
            return;
        }else{
            boolean flag = false;
            System.out.println("\n\t ***** Enter 1 to start playlist and play first song. Then...");

            while(!flag) {
                System.out.println("\nEnter " +
                        "\n\t 0 - to see list of songs in playlist " +
                        "\n\t 1 - to go to next song." +
                        "\n\t 2 - for previous." +
                        "\n\t 3 - to repeat song." +
                        "\n\t 4 - to start playlist" +
                        "\n\t 5 - to quit\n");

                //System.out.println("Now playing " + listIterator.next().getSongTitle());
                Scanner scanner = new Scanner(System.in);
                int option = scanner.nextInt();

                if(option>5){
                    System.out.println("\n wrong option selected!!! select one of 5 options");
                }else {


                    switch (option) {

                        case 0:
                            printSongsInPlayList();
                            break;

                        case 1:
                            if (!goingForward) {
                                if (listIterator.hasNext()) {
                                    listIterator.next();
                                }
                                goingForward = true;
                            }

                            if (listIterator.hasNext()) {
                                current = listIterator.next().getSongTitle();
                                System.out.println("Now playing " + current);
                                //listIterator.next();
                                // playlistStarted = true;
                                break;
                            } else {
                                System.out.println("No more songs reached end of list");
                                //listIterator.next();
                                //goingForward = false;
                                //flag=true;
                                break;
                            }

                        case 2:

                            if (goingForward) {
                                if (listIterator.hasPrevious()) {
                                    listIterator.previous();
                                }
                                goingForward = false;
                            }

                            if (listIterator.hasPrevious()) {
                                current = listIterator.previous().getSongTitle();
                                System.out.println("Now playing " + current);
                                break;
                            } else {
                                System.out.println("No more songs reached end of list");
                                goingForward = true;
                                //flag=true;
                                break;
                            }

                        case 3:
                            //if(playlistStarted==true){
                            if (goingForward == true && listIterator.hasNext()) {
                                listIterator.next();
                            } else if (goingForward == false && listIterator.hasPrevious()) {
                                listIterator.previous();
                            } /*else {
                                System.out.println("No songs ");
                            }*/

                            System.out.println("Now playing " + current);

                            break;
                        case 4:
                            if (playlistStarted == false) {
                                if (goingForward == true && listIterator.hasNext()) {
                                    current = listIterator.next().getSongTitle();
                                    System.out.println("Now playing " + current);
                                    playlistStarted = true;
                                } else {
                                    System.out.println("playlist not started");
                                    System.out.println("\n\t ***** Enter 1 to start playlist and play first song. Then...");
                                }
                            } else {
                                System.out.println("playlist already started");

                            }
                            break;

                        case 5:
                            //System.out.println("wrong option entered ");
                            return;


                        default:
                            System.out.println(" wrong option entered");
                            break;
                    }
                }
            }
        }

    }


    public void addSongsToPlaylist(){
        SongsInAlbum songsInAlbum = new SongsInAlbum();
        songsInAlbum.albumsCreated();



        ArrayList<Song> arrListOfSongs = songsInAlbum.listOfSongs();
        boolean falg = true;

        while(falg == true) {
            for (int i = 0; i < arrListOfSongs.size(); i++) {
                //System.out.println(arrListOfSongs.get(i));
                System.out.println("select the songs from the albums to be added to playlist. Enter the names of songs");
                Scanner scanner = new Scanner(System.in);
                String option = scanner.nextLine().toLowerCase();
                //scanner.nextLine();


                for (int j=0;j<arrListOfSongs.size();j++) {

                    if (arrListOfSongs.get(j).getSongTitle().equals(option)) {
                        boolean setFlag = playlistSet.add(arrListOfSongs.get(j));
                        if(setFlag) {
                            playListSongs.add(arrListOfSongs.get(j));
                            System.out.println(option + " added successfully \n");
                        } else{
                            System.out.println("Could'nt add songs as song already exists in playlist.");
                        }

                        break;
                    } /*else if(!arrListOfSongs.get(j).getSongTitle().equals(option)){
                           boolean flag1 = false;
                           while (flag1==false) {
                               String option1 = scanner.nextLine().toLowerCase();
                               if(arrListOfSongs.get(j).getSongTitle().equals(option1)){
                                   playListSongs.add(arrListOfSongs.get(j));
                                   flag1=true;
                                   System.out.println(option1 + " added successfully \n");
                                   //break;
                               }else {
                                   System.out.println("Wrong name typed. type the correct name ");
                                   //option1 = scanner.nextLine().toLowerCase();
                                   flag1=false;
                                   //continue;
                               }
                           }
*/
                        }
                //}//System.out.println("Could'nt add songs. Enter the name as displayed with single space");

                System.out.println(" Enter..." +
                        "\n\t 1 - finish adding songs. " +
                        "\n\t 0 - to continue");
                int option1 = scanner.nextInt();
                switch (option1){
                    case 0:
                        //scanner.close();
                        continue;
                    case 1:
                        falg = false;
                        return;
                    default:
                        System.out.println("Wrong option selected. Selected 0 or 1!! ");
                        break;

                }

            }
            falg = true;
        }
    }

    public void printSongsInPlayList(){

        System.out.println("Songs in playlist");
        for (int i=0;i<playListSongs.size();i++){
            System.out.println((i+1)+ " name = " + playListSongs.get(i).getSongTitle() + ",\t duration = " +playListSongs.get(i).getSongDuration());
        }
    }



    public void options(){
        System.out.println(" enter one of the following options " +
                "\n 1. Quit " +
                "\n 2. Skip forward to next song" +
                "\n 3. Skip backwards to previous song " +
                "\n 4. Replay current song" +
                "\n 5. List the songs in playlist" +
                "\n 6. delet current song");
    }
}
