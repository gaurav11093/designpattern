package com.gaurav.coursera.designpattern.composit;

import java.util.List;

public class Playlist implements IComponent {

  private String name;
  private List<IComponent> songs;

  public Playlist(String playlistName) {
    this.name = playlistName;
  }

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
