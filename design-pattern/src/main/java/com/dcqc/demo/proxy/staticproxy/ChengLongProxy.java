package com.dcqc.demo.proxy.staticproxy;

/**
 * @program: design-pattern
 * @description 成龙的代理类。Proxy（代理主题角色）：代理主题角色内部包含了对真实主题的引用，从而可以在任何时候操作真实主题对象；
 * @author: duochiqingcai
 * @create: 2019-03-10 00:23
 **/
public class ChengLongProxy implements Star {
    //被代理的明星
    private ChengLong chengLong;

    public ChengLongProxy() {
        chengLong = new ChengLong();
    }

    @Override
    public void doAdvertisement() {
        chengLong.doAdvertisement();
    }
}
