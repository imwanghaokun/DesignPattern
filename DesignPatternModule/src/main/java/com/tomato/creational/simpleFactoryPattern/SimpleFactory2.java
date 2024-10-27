package com.tomato.creational.simpleFactoryPattern;

import java.util.HashMap;

/**
 * 静态方式实现简单工厂
 */
public class SimpleFactory2 {
    static HashMap<String,Operation> operationMap=new HashMap<>();
    static {
        operationMap.put("add",new AddOperation());
        operationMap.put("sub",new SubOperation());
        operationMap.put("multiply",new MultiplyOperation());
        operationMap.put("divide",new DivideOperation());
    }
    public static Operation getOperation(String operation){
        return operationMap.get(operation);
    }
}
