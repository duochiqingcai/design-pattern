package com.dcqc.demo.strategy.withstrategy;

/**
 * @program: design-pattern
 * @description 狂战士类
 * @author: duochiqingcai
 * @create: 2019-03-06 22:23
 **/
public class Berserker extends Swordman {
    /**
     * 构造方法，设置名称和角色对应的外貌和技能攻击
     *
     * @param name
     */
    public Berserker(String name) {
        this.name = name;
        displayBehavior = new Display1();
        skillAttackBehavior = new SkillAttack2();
    }


}
