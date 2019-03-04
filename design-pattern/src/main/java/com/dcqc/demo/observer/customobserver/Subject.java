package com.dcqc.demo.observer.customobserver;


/**
 * @program: design-pattern
 * @description 自定义主题接口，所有主题实现该接口
 * @author: duochiqingcai
 * @create: 2019-03-04 13:46
 **/
public interface Subject {
    /**
     * 注册观察者
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    public void deleteObserver(Observer observer);

    /**
     * 通知观察者
     */
    public void notifyObservers();
}
