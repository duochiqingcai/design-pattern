package com.dcqc.demo.proxy;

/**
 * @program: design-pattern
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-09 22:08
 **/
public class Test {
    public static void main(String[] args) {
        Test test = new Test();

        System.out.println(test.replace("test", 'a', "add"));
    }

    public String replace(String s, char oldSub, String newSub) {
        if ((s == null) || (newSub == null)) {
            return null;
        }

        char[] c = s.toCharArray();

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == oldSub) {
                stringBuffer.append(newSub);
            } else {
                stringBuffer.append(c[i]);
            }
        }
        return stringBuffer.toString();
    }
}
