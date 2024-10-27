package com.tomato.creational.FactoryMethodPattern;

public class MultiplyOperation extends Operation {
    @Override
    public void apply(int a, int b) {
        System.out.println(a * b);
    }
}
