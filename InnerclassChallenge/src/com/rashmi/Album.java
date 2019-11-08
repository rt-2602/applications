package com.rashmi;

import java.util.ArrayList;

public class Album {
    //ArrayList<Song> arrAlbum ;
    String albumName;
    songList arrAlbum;

    public Album() {
        this.arrAlbum = new songList();
        this.albumName = albumName;
    }

    public ArrayList<Song> getArrAlbum() {
        return arrAlbum.getArrAlbum();
    }

    public void setArrAlbum(ArrayList<Song> arrAlbum) {
        this.arrAlbum.setArrAlbum(arrAlbum);
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    songList songs = new songList();


    private class songList{
        ArrayList<Song> arrAlbum = new ArrayList<>();

        public void setArrAlbum(ArrayList<Song> arrAlbum) {
            this.arrAlbum = arrAlbum;
        }

        public ArrayList<Song> getArrAlbum() {
            return arrAlbum;
        }

    }
}
