package com.dcqc.demo.factory.abstractfactory;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-04 22:57
 **/
public class AudiFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Audi();
    }

    @Override
    public Engine getEngine() {
        return new AudiEngine();
    }
}
