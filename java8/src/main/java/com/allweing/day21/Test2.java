package com.allweing.day21;

import java.lang.reflect.Proxy;

/**
 * @auther: zzzgyu
 */

public class Test2 {
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl();
        Student o = (Student) Proxy.newProxyInstance(Test2.class.getClassLoader(), new Class[]{Student.class}, new StudentProxy(student));
        o.say();
    }
}
