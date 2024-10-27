package com.tomato.behavioral.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气通知系统
 * 被观察者--天气
 */
public class WeatherImpl implements Weather {
    private Integer temperature;
    private Integer humidity;
    private Integer windSpeed;
    private Integer pressure;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, windSpeed, pressure);
        }
    }

    public WeatherImpl() {
    }

    public WeatherImpl(Integer temperature, Integer humidity, Integer windSpeed, Integer pressure) {
    }

    @Override
    public String toString() {
        return "Weather{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", windSpeed=" + windSpeed +
                ", pressure=" + pressure +
                '}';
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
        notifyObservers();
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
        notifyObservers();
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
        notifyObservers();
    }
}
