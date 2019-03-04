package com.dcqc.demo.factory.simplefactory;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-04 19:40
 **/
public class Benz implements Car {
    public Benz(){
        System.out.println("奔驰");
    }

    @Override
    public void run() {
        System.out.println("制造奔驰汽车");
    }

    @Override
    public void blow() {
        System.out.println("嘀嘀嘀");
    }
}
