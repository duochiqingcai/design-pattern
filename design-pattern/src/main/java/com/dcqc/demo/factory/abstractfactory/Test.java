package com.dcqc.demo.factory.abstractfactory;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-04 22:58
 **/
public class Test {
    public static void main(String[] args) {
        CarFactory carFactory = new BenzFactory();

        Car benz = carFactory.getCar();

        Engine engine = carFactory.getEngine();

        benz.run();

        engine.fire();
    }
}
