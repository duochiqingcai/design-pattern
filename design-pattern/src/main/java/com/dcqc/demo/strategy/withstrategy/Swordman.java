package com.dcqc.demo.strategy.withstrategy;

/**
 * @program: design-pattern
 * @description 鬼剑士的抽象超类
 * @author: duochiqingcai
 * @create: 2019-03-06 22:18
 **/
public abstract class Swordman {
    //转职角色名称不同
    protected String name;

    protected DisplayBehavior displayBehavior;

    protected SkillAttackBehavior skillAttackBehavior;

    //奔跑相同,不变，直接继承
    public void run() {
        System.out.println("鬼剑士的奔跑都一样");
    }

    //普通攻击相同,不变，直接继承
    public void attack() {
        System.out.println("鬼剑士的普通攻击都一样");
    }

    //外貌display
    public void setDisplayBehavior() {
        displayBehavior.display();
    }

    //技能攻击skillAttack
    public void setSkillAttackBehavior() {
        skillAttackBehavior.skillAttack();
    }


}
