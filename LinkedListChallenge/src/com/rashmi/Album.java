package com.rashmi;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    ArrayList<Song> arrAlbum ;
    String albumName;

    public Album() {
        this.arrAlbum = new ArrayList<Song>();
        this.albumName = albumName;
    }

    public ArrayList<Song> getArrAlbum() {
        return arrAlbum;
    }

    public void setArrAlbum(ArrayList<Song> arrAlbum) {
        this.arrAlbum = arrAlbum;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}
