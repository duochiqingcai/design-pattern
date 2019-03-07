package com.dcqc.demo.adapter;

/**
 * @program: design-pattern
 * @description 转接线，将type-c转换为3.5mm耳机接口
 * @author: duochiqingcai
 * @create: 2019-03-07 22:33
 **/
public class TransformAdapter implements HeadSetHole {
    /**
     * 组合
     */
    private TypeC typeC;

    public TransformAdapter(TypeC typeC) {
        this.typeC = typeC;
    }

    @Override
    public String provideHole() {
        System.out.println(typeC.provideTypeC()+"...正在转换");
        //经过一系列操作，将type-c转换为3.5mm耳机
        return "这是3.5mm耳机接口";
    }
}
