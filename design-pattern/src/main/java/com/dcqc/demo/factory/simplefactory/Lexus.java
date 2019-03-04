package com.dcqc.demo.factory.simplefactory;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-04 19:43
 **/
public class Lexus implements Car {
    public Lexus(){
        System.out.println("雷克萨斯");
    }

    @Override
    public void run() {
        System.out.println("制造雷克萨斯汽车");
    }

    @Override
    public void blow() {
        System.out.println("嘀嘀嘀");
    }
}
