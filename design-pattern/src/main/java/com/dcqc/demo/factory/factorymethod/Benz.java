package com.dcqc.demo.factory.factorymethod;



/**
 * @program: design-pattern
 * @description 具体产品
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
