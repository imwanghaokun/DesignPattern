package com.tomato.creational.simpleFactoryPattern;

public class SubOperation extends Operation{
    @Override
    public void apply(int a, int b) {
        System.out.println(a-b);
    }
}
