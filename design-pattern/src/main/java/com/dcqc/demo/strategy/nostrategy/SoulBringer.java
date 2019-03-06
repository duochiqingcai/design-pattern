package com.dcqc.demo.strategy.nostrategy;

/**
 * @program: design-pattern
 * @description 鬼泣的类
 * @author: duochiqingcai
 * @create: 2019-03-06 22:16
 **/
public class SoulBringer extends Swordman {
    public SoulBringer(String name){
        this.name=name;
    }

    @Override
    protected void display() {
        System.out.println("外貌-3");
    }

    @Override
    protected void skillAttack() {
        System.out.println("技能攻击-7");
    }
}
