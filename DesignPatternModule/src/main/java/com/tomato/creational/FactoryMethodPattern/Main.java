package com.tomato.creational.FactoryMethodPattern;

public class Main {
    public static void main(String[] args) {
        Operation operation = new AddOperationFactory().createOperation();
        operation.apply(1, 2);
    }
}
