package com.dcqc.demo.observer.customobserver;

/**
 * @program: design-pattern
 * @description 模拟观察者二号
 * @author: duochiqingcai
 * @create: 2019-03-04 14:33
 **/
public class Observer2 implements Observer {
    private Subject subject;

    /**
     * 向对应主题请求注册其成为观察者,构造方法添加
     *
     * @param subject
     */
    public Observer2(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    /**
     * 请求取消观察者身份
     *
     * @param subject
     */
    public void removeObserver(Subject subject) {
        this.subject = subject;
        subject.deleteObserver(this);
    }

    @Override
    public void update(String string) {
        System.out.println("observer2接收到消息，消息内容为：" + string);
    }
}
