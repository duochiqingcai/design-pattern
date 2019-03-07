package com.dcqc.demo.adapter;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-07 22:42
 **/
public class Test {
    public static void main(String[] args) {
        //耳机
        HeadSet headSet = new HeadSet();
        //耳机孔，通过转接线转换
        HeadSetHole headSetHole = new TransformAdapter(new TypeC());
        //播放
        headSet.playMusic(headSetHole);

    }
}
