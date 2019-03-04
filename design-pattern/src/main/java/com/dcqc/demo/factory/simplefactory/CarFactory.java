package com.dcqc.demo.factory.simplefactory;

/**
 * @program: design-pattern
 * @description 简单工厂类,不符合开闭原则
 * @author: duochiqingcai
 * @create: 2019-03-04 19:46
 **/
public class CarFactory {
    public static Car getCar(String carType) {
        if (carType == null) return null;
        if (carType.equalsIgnoreCase("benz")) return new Benz();
        if (carType.equalsIgnoreCase("audi")) return new Audi();
        if (carType.equalsIgnoreCase("lexus")) return new Lexus();

        return null;
    }
}
