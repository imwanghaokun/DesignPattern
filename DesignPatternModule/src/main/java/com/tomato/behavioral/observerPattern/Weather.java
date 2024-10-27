package com.tomato.behavioral.observerPattern;

public interface Weather {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}