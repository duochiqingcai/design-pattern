package com.dcqc.demo.strategy.nostrategy;

/**
 * @program: design-pattern
 * @description 狂战士的类
 * @author: duochiqingcai
 * @create: 2019-03-06 22:14
 **/
public class Berserker extends Swordman {

    public Berserker(String name) {
        this.name = name;
    }

    @Override
    protected void display() {
        System.out.println("外貌-1");
    }

    @Override
    protected void skillAttack() {
        System.out.println("技能攻击-2");
    }
}