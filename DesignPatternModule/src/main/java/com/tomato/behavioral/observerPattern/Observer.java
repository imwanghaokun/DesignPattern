package com.tomato.behavioral.observerPattern;


public interface Observer {
    public void update(Integer temperature, Integer humidity, Integer windSpeed, Integer pressure);
}
