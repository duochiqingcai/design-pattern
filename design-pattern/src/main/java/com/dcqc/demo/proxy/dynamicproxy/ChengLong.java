package com.dcqc.demo.proxy.dynamicproxy;

/**
 * @program: design-pattern
 * @description RealSubject（真实主题角色）：定义了代理角色所代表的真实对象，在真实主题角色中实现了真实的业务操作。
 * @author: duochiqingcai
 * @create: 2019-03-10 15:08
 **/
public class ChengLong implements Star {
    @Override
    public void doAdvertisement() {
        System.out.println("动态代理：这是请成龙拍摄的广告！！！");
    }
}
