package com.dcqc.demo.proxy.dynamicproxy;

/**
 * @program: design-pattern
 * @description 明星接口，Subject（抽象主题角色）：声明真实主题和代理主题的共同接口，使得在任何使用真实主题的地方都可以使用代理主题。
 * @author: duochiqingcai
 * @create: 2019-03-10 15:09
 **/
public interface Star {
    /**
     * 拍广告
     */
    void doAdvertisement();
}
