package com.tomato.creational.FactoryMethodPattern;

public class AddOperationFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        return new AddOperation();
    }
}
