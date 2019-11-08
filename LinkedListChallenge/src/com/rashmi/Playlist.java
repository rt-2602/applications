package com.rashmi;

import java.util.LinkedList;


public class Playlist {
    LinkedList<Album> playList = new LinkedList<Album>();

    public LinkedList<Album> getPlayList() {
        return playList;
    }

    public void setPlayList(LinkedList<Album> playList) {
        this.playList = playList;
    }
}
