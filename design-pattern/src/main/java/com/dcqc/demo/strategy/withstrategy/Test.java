package com.dcqc.demo.strategy.withstrategy;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-06 22:31
 **/
public class Test {
    public static void main(String[] args) {
        Swordman berserker = new Berserker("狂战士");

        berserker.setDisplayBehavior();
        berserker.setSkillAttackBehavior();

        Swordman bladeMaster = new BladeMaster("剑魂");
        bladeMaster.setSkillAttackBehavior();
        bladeMaster.setDisplayBehavior();
        bladeMaster.attack();
    }
}
