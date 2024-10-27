package com.tomato.creational.simpleFactoryPattern;

public class DivideOperation extends Operation {
    @Override
    public void apply(int a, int b) {
        System.out.println(a / b);
    }
}
