package com.dcqc.demo.proxy.staticproxy;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-10 00:31
 **/
public class Test {
    public static void main(String[] args) {

        //生成代理对象
        ChengLongProxy chengLongProxy = new ChengLongProxy();
        //通过代理访问
        chengLongProxy.doAdvertisement();


    }
}
