package com.dcqc.demo.singleton;

/**
 * @program: design-pattern
 * @description enum方式, 最佳单例方法
 * @author: duochiqingcai
 * @create: 2019-03-05 11:36
 **/
public enum SingletonEHan2 {
    //定义一个枚举元素，就是唯一实例
    INSTANCE;

    public void sayHi() {
        System.out.println("Hi");
    }
}
