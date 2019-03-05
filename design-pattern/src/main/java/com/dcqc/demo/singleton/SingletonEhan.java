package com.dcqc.demo.singleton;

/**
 * @program: design-pattern
 * @description 饿汉方式，线程安全;所谓 “饿汉方式” 就是说JVM在加载这个类时就马上创建此唯一的单例实例，不管你用不用，
 *              先创建了再说，如果一直没有被使用，便浪费了空间，典型的空间换时间，每次调用的时候，就不需要再判断，节省了运行时间。
 * @author: duochiqingcai
 * @create: 2019-03-05 10:40
 **/
public class SingletonEhan {
    //在静态初始化器中创建单例实例，这段代码保证线程安全
    private static SingletonEhan uniqueInstance = new SingletonEhan();

    //私有构造方法
    private SingletonEhan() {
    }

    public static SingletonEhan getInstance() {
        return uniqueInstance;
    }
}
