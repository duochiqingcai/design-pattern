package com.dcqc.demo.factory.simplefactory;

/**
 * @program: design-pattern
 * @description 简单工厂类, 利用反射改善简单工厂，利于拓展
 * @author: duochiqingcai
 * @create: 2019-03-04 20:51
 **/
public class CarFactory2 {
    /**
     * 通过反射获取参数对象
     * @param clazz
     * @return
     */
    public static Object getClass(Class<? extends Car> clazz) {
        Object object = null;

        try {
            object = Class.forName(clazz.getName()).newInstance();
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
