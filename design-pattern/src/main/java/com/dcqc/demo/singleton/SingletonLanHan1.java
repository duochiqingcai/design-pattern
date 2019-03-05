package com.dcqc.demo.singleton;

import java.security.Signature;

/**
 * @program: design-pattern
 * @description 懒汉方式，非线程安全和synchronized关键字线程安全版本
 * @author: duochiqingcai
 * @create: 2019-03-05 10:47
 **/
public class SingletonLanHan1 {
    private static SingletonLanHan1 uniqueInstance;

    private SingletonLanHan1() {
    }

    //如果不加synchronized关键字，则线程不安全
    public static synchronized SingletonLanHan1 getUniqueInstance() {
        //必须进行非空判断单例是否存在，若存在则反悔，不存在就创建单例
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonLanHan1();
        }
        return uniqueInstance;
    }

    public void sayHi(){
        System.out.println("HI");
    }
}
