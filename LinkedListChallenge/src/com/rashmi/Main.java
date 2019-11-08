package com.rashmi;

public class Main {

    public static void main(String[] args) {
       // ArrayList<Album> arrAlbum = new ArrayList<Album>();
        SongsInAlbum songsInAlbum = new SongsInAlbum();
	    songsInAlbum.listOfSongs();
	    songsInAlbum.printSongs();
	    //Album album =
        songsInAlbum.createAlbum();
        songsInAlbum.albumsCreated();

        PlaylistService playlistService = new PlaylistService();
        playlistService.addSongsToPlaylist();
        playlistService.printSongsInPlayList();


        //System.out.println(" \n calling next");
        playlistService.skipForwardToNextSong();

        //System.out.println("\n  calling previous");

       // playlistService.skipBackwardToPreviousSong();
    }
}
