package com.tomato.behavioral.observerPattern;

public class WeatherObserver implements Observer {

    @Override
    public void update(Integer temperature, Integer humidity, Integer windSpeed, Integer pressure) {
        System.out.printf("收到天气通知：今日气温：%d; 湿度：%d; 风速：%d; 气压：%d%n", temperature, humidity, windSpeed, pressure);
    }
}
