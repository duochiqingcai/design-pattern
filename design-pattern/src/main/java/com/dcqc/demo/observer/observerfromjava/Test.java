package com.dcqc.demo.observer.observerfromjava;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-04 14:57
 **/
public class Test {
    public static void main(String[] args) {
        SubjectForNews subjectForNews = new SubjectForNews();

        Observer1 observer1 = new Observer1();
        observer1.registerSubject(subjectForNews);

        subjectForNews.setMsg("这是一条Java内置观察者类");
    }
}
