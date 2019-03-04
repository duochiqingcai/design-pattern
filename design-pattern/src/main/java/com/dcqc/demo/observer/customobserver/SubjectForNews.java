package com.dcqc.demo.observer.customobserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design-pattern
 * @description 具体主题，实现自定义主题接口
 * @author: duochiqingcai
 * @create: 2019-03-04 13:58
 **/
public class SubjectForNews implements Subject  {
    /**
     * 观察者目录
     */
    private List<Observer> observers = new ArrayList<Observer>();
    /**
     * 定义新闻消息
     */
    private String msg;

    /**
     * 注册新的观察者加入观察者目录
     *
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 将观察者从观察者目录中删除
     *
     * @param observer
     */
    @Override
    public void deleteObserver(Observer observer) {
        /**
         * 返回对象在列表中的索引，没有则返回-1;然后根据索引清除观察者
         */
        int index = observers.indexOf(observer);
        if (index >= 0) observers.remove(index);
    }

    /**
     * 通知观察者
     */
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(msg);
        }
    }

    /**
     * 主题更新消息
     * @param msg
     */
    public void setMsg(String msg){
        this.msg=msg;
        notifyObservers();
    }
}
