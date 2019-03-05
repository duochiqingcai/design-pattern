package com.dcqc.demo.singleton;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-05 10:45
 **/
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        SingletonLanHan1 singletonLanHan1 = SingletonLanHan1.getUniqueInstance();
        System.out.println(singletonLanHan1.hashCode());

        singletonLanHan1.sayHi();

        SingletonEHan2 singletonEHan2 = SingletonEHan2.INSTANCE;
        singletonEHan2.sayHi();
    }
}
