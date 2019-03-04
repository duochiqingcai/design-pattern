package com.dcqc.demo.factory.abstractfactory;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-04 22:56
 **/
public class BenzFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Benz();
    }

    @Override
    public Engine getEngine() {
        return new BenzEngine();
    }
}
