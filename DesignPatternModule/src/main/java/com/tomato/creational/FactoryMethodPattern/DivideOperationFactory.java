package com.tomato.creational.FactoryMethodPattern;

public class DivideOperationFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        return new DivideOperation();
    }
}
