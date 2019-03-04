package com.dcqc.demo.factory.simplefactory;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-04 19:41
 **/
public class Audi implements Car {
    public Audi(){
        System.out.println("奥迪");
    }

    @Override
    public void run() {
        System.out.println("制造奥迪汽车");
    }

    @Override
    public void blow() {
        System.out.println("嘀嘀嘀");
    }
}
