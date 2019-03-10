package com.dcqc.demo.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-10 18:34
 **/
public class ChengLongProxy implements InvocationHandler {
    private ChengLong chengLong;

    public ChengLongProxy() {
        chengLong = new ChengLong();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(chengLong, args);
    }
}
