package com.dcqc.demo.factory.abstractfactory;

/**
 * @program: design-pattern
 * @description 具体产品
 * @author: duochiqingcai
 * @create: 2019-03-04 22:53
 **/
public class AudiEngine implements Engine {

    @Override
    public void fire() {
        System.out.println("奥迪发动机点火");
    }
}
