package com.dcqc.demo.singleton;

/**
 * @program: design-pattern
 * @description 懒汉方式，双重检查加锁版本,使用volatile和synchronized关键字
 * @author: duochiqingcai
 * @create: 2019-03-05 11:17
 **/
public class SingletonLanHan2 {
    //volatile保证，当uniqueInstance变量初始化成SingletonLanHan2实例时，多个线程可正确处理uniqueInstance变量
    private volatile static SingletonLanHan2 uniqueInstance;

    private SingletonLanHan2() {
    }

    public static SingletonLanHan2 getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonLanHan2.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonLanHan2();
                }
            }
        }
        return uniqueInstance;
    }

}
