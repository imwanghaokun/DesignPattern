package com.tomato.creational.simpleFactoryPattern;

public class Main {
    public static void main(String[] args) {
        Operation operation = SimpleFactory.getOperation("add");
        operation.apply(1,2);
    }
}
