package com.gaurav.coursera.designpattern.composit;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IComponent {

    List<IComponent> songs = new ArrayList<IComponent>();

    public void play() {
        for (IComponent song : songs) {
            song.play();
        }
    }

    public void add(IComponent song) {
        song.add(song);

    }

    public void remove(IComponent song) {
        songs.remove(song);
    }
}
