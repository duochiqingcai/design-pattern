package com.dcqc.demo.factory.simplefactory;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-04 20:55
 **/
public class Test2 {
    public static void main(String[] args) {
        Lexus lexus= (Lexus) CarFactory2.getClass(Lexus.class);
    }
}
