package com.dcqc.demo.observer.customobserver;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-04 14:37
 **/
public class Test {
    public static void main(String[] args) {

        SubjectForNews subjectForNews = new SubjectForNews();

        Observer1 observer1 = new Observer1(subjectForNews);
        Observer2 observer2 = new Observer2(subjectForNews);

        subjectForNews.setMsg("这是自定义观察者模式发送的一条消息");
    }
}
