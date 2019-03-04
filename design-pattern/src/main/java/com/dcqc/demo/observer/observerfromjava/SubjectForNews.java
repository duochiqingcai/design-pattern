package com.dcqc.demo.observer.observerfromjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @program: design-pattern
 * @description 继承java提供Observable类
 * @author: duochiqingcai
 * @create: 2019-03-04 14:43
 **/
public class SubjectForNews extends Observable {
    private List<Observer> observers = new ArrayList<Observer>();

    private String msg;

    public String getMsg() {
        return msg;
    }

    /**
     * 主题更新消息
     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers(msg);
    }


}
