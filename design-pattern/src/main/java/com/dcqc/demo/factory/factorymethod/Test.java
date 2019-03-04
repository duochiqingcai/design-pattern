package com.dcqc.demo.factory.factorymethod;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-04 22:13
 **/
public class Test {
    public static void main(String[] args) {
        CarFactory benzFactory = new BenzFactory();
        Car benz = benzFactory.getCar();

        benz.run();

    }
}
