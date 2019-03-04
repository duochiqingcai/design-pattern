package com.dcqc.demo.factory.abstractfactory;

/**
 * @program: design-pattern
 * @description 抽象工厂 工厂方法中一个工厂只能生产一种产品，而抽象工厂可以生产多个。
 * @author: duochiqingcai
 * @create: 2019-03-04 22:55
 **/
public interface CarFactory {
    public Car getCar();

    public Engine getEngine();
}
