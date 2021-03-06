package com.gaurav.coursera.designpattern.composit;

import java.util.ArrayList;

public abstract class User {

    String username;

    public User(String username) {
        this.username = username;
    }

    ArrayList<IComponent> playlists = new ArrayList();

    public void createPlaylist(Playlist newPlaylist) {
        //Create a new playlist.
    }

    public void deletePlaylist(Playlist newPlaylist) {
        //Deletes a playlist.
    }

    public void playPlaylist(String playlistName) {
        //Plays a specific playlist.
    }

    public void playSong(String songName) {
        //Plays a specific song.
    }
}