package com.dcqc.demo.observer.observerfromjava;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: design-pattern
 * @description模拟观察者一号
 * @author: duochiqingcai
 * @create: 2019-03-04 14:50
 **/
public class Observer1 implements Observer {
    /**
     * 向继承Observable的主题注册观察者身份
     * @param observable
     */
    public void registerSubject(Observable observable){
        observable.addObserver(this);
    }

    /**
     * 根据不同主题接受消息
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {

        System.out.println("observer1接收到"+o.toString()+"的消息，消息内容为："+arg);
    }
}
