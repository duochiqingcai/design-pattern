package com.dcqc.demo.strategy.withstrategy;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-07 00:06
 **/
public class SoulBringer extends Swordman {
    /**
     * 构造方法，设置名称和角色对应的外貌和技能攻击
     *
     * @param name
     */
    public SoulBringer(String name) {
        this.name = name;
        displayBehavior = new Display1();
        skillAttackBehavior = new SkillAttack1();
    }
}
