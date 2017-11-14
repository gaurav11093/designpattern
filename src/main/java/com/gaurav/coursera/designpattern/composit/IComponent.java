package com.gaurav.coursera.designpattern.composit;

public interface IComponent {

    public void play();

    public void add(IComponent song);

    public void remove(IComponent song);

}
