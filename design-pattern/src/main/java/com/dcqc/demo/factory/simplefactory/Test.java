package com.dcqc.demo.factory.simplefactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-04 20:46
 **/
public class Test {
    private static final Logger logger= LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        //获取Benz对象
        Car benz=CarFactory.getCar("benz");

        benz.blow();
        benz.run();
    }
}
