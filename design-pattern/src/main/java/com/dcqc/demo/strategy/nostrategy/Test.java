package com.dcqc.demo.strategy.nostrategy;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-06 22:30
 **/
public class Test {
    public static void main(String[] args) {
        Berserker berserker=new Berserker("狂战士");
        System.out.println(berserker.name);
        berserker.run();
        berserker.skillAttack();
    }
}
