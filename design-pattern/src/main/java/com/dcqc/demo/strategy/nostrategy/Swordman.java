package com.dcqc.demo.strategy.nostrategy;

import com.dcqc.demo.strategy.withstrategy.DisplayBehavior;
import com.dcqc.demo.strategy.withstrategy.SkillAttackBehavior;

/**
 * @program: design-pattern
 * @description 鬼剑士的抽象超类
 * @author: duochiqingcai
 * @create: 2019-03-06 21:57
 **/
public abstract class Swordman {
    //转职角色名称不同
    protected String name;

    //奔跑相同
    public void run() {
        System.out.println("鬼剑士的奔跑都一样");
    }

    //普通攻击相同
    public void attack() {
        System.out.println("鬼剑士的普通攻击都一样");
    }

    //display外貌不同
    protected abstract void display();

    //技能形态不同
    protected abstract void skillAttack();
}
