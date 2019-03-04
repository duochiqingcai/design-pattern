package com.dcqc.demo.factory.abstractfactory;

/**
 * @program: design-pattern
 * @description 具体产品
 * @author: duochiqingcai
 * @create: 2019-03-04 22:54
 **/
public class BenzEngine implements Engine {
    @Override
    public void fire() {
        System.out.println("奔驰发动机点火");
    }
}
