package com.tomato.creational.simpleFactoryPattern;

/**
 * 非静态方式实现工厂类
 */
public class SimpleFactory {
    //非静态
    public static Operation getOperation(String operation) {
        Operation op = switch (operation) {
            case "add" -> new AddOperation();
            case "subtract" -> new SubOperation();
            case "multiply" -> new MultiplyOperation();
            case "divide" -> new DivideOperation();
            default -> null;
        };
        return op;
    }
}
