package com.dcqc.demo.strategy.withstrategy;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-06 23:41
 **/
public class Display1 implements DisplayBehavior {
    @Override
    public void display() {
        System.out.println("这是外貌-1");
    }
}
