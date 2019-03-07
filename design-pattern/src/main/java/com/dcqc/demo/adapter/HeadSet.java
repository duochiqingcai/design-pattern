package com.dcqc.demo.adapter;

/**
 * @program: design-pattern
 * @description 定义3.5mm耳机类
 * @author: duochiqingcai
 * @create: 2019-03-07 22:17
 **/
public class HeadSet {
    /**
     * 需要3.5mm接口参数才能正常播放音乐
     *
     * @param headSetHole
     */
    public void playMusic(HeadSetHole headSetHole) {

        System.out.println(headSetHole.provideHole());
    }
}
