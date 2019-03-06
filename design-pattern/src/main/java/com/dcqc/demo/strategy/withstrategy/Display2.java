package com.dcqc.demo.strategy.withstrategy;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-06 23:42
 **/
public class Display2 implements DisplayBehavior {
    @Override
    public void display() {
        System.out.println("这是外貌-2");
    }
}
