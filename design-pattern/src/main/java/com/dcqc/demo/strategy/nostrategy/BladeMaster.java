package com.dcqc.demo.strategy.nostrategy;

/**
 * @program: design-pattern
 * @description 剑魂的类
 * @author: duochiqingcai
 * @create: 2019-03-06 22:11
 **/
public class BladeMaster extends Swordman {
    public BladeMaster(String name) {
        this.name = name;
    }

    @Override
    protected void display() {
        System.out.println("外貌-2");
    }

    @Override
    protected void skillAttack() {
        System.out.println("技能攻击-3");
    }
}
