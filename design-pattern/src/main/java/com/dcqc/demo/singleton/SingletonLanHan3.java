package com.dcqc.demo.singleton;

/**
 * @program: design-pattern
 * @description 静态内部类方式
 * @author: duochiqingcai
 * @create: 2019-03-05 11:28
 **/
public class SingletonLanHan3 {
    //内部类
    private static class SingletonHolder {
        private static final SingletonLanHan3 INSTANCE = new SingletonLanHan3();
    }

    private SingletonLanHan3() {
    }

    public static SingletonLanHan3 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
