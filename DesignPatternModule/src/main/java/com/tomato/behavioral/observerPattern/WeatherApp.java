package com.tomato.behavioral.observerPattern;

import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {

        WeatherImpl weather = new WeatherImpl();
        WeatherObserver weatherObserver1 = new WeatherObserver();
        WeatherObserver weatherObserver2 = new WeatherObserver();
        weather.addObserver(weatherObserver1);
        weather.addObserver(weatherObserver2);
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n请选择要设置的天气属性：");
            System.out.println("1. 温度");
            System.out.println("2. 湿度");
            System.out.println("3. 风速");
            System.out.println("4. 气压");
            System.out.println("5. 退出");

            int choice = scanner.nextInt();
            scanner.nextLine();  // 消耗换行符

            switch (choice) {
                case 1:
                    System.out.print("请输入温度: ");
                    int temperature = scanner.nextInt();
                    scanner.nextLine();  // 消耗换行符
                    weather.setTemperature(temperature);
                    break;
                case 2:
                    System.out.print("请输入湿度: ");
                    int humidity = scanner.nextInt();
                    scanner.nextLine();  // 消耗换行符
                    weather.setHumidity(humidity);
                    break;
                case 3:
                    System.out.print("请输入风速: ");
                    int windSpeed = scanner.nextInt();
                    scanner.nextLine();  // 消耗换行符
                    weather.setWindSpeed(windSpeed);
                    break;
                case 4:
                    System.out.print("请输入气压: ");
                    int pressure = scanner.nextInt();
                    scanner.nextLine();  // 消耗换行符
                    weather.setPressure(pressure);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("无效的选择，请重新输入。");
            }
        }

        scanner.close();
    }
}
