package com.tomato.creational.FactoryMethodPattern;

public class AddOperation extends Operation {
    @Override
    public void apply(int a, int b) {
        System.out.println(a + b);
    }
}
