package com.tomato.creational.FactoryMethodPattern;

public class MultiplyOperationFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        return new MultiplyOperation();
    }
}
