package com.dcqc.demo.proxy.dynamicproxy;

import javafx.beans.binding.ObjectExpression;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-10 15:03
 **/
public class Test {
    public static void main(String[] args) {
        //动态代理
        ChengLongProxy chengLongProxy = new ChengLongProxy();

        Star chengLong = (Star) Proxy.newProxyInstance(ChengLong.class.getClassLoader(), ChengLong.class.getInterfaces(), chengLongProxy);

        chengLong.doAdvertisement();
    }
}
