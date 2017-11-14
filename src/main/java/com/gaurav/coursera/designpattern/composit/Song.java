package com.gaurav.coursera.designpattern.composit;

public class Song implements IComponent {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void play() {

    }

    public void add(IComponent song) {

    }

    public void remove(IComponent song) {

    }
}
