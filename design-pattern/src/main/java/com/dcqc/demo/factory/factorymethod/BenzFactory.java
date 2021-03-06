package com.dcqc.demo.factory.factorymethod;

/**
 * @program: design-pattern
 * @description 具体工厂
 * @author: duochiqingcai
 * @create: 2019-03-04 22:08
 **/
public class BenzFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
