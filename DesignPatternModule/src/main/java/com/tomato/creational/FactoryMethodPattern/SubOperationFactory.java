package com.tomato.creational.FactoryMethodPattern;

public class SubOperationFactory implements OperationFactory{

    @Override
    public Operation createOperation() {
        return new SubOperation();
    }
}
