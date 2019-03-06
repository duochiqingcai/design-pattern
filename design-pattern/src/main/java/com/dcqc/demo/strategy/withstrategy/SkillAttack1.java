package com.dcqc.demo.strategy.withstrategy;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-06 23:41
 **/
public class SkillAttack1 implements SkillAttackBehavior {
    @Override
    public void skillAttack() {
        System.out.println("这是技能攻击-1");
    }
}
