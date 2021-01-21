package com.allweing.desigenpattern.proxypattern;

import java.lang.reflect.Proxy;

/**
 * @auther: zzzgyu
 * 动态代理
 */

public class Test2 {
    public static void main(String[] args) {
        //被代理的类
        Student student = new Student();

        StiInvocation<Student> studentStiInvocation = new StiInvocation<>(student);

        Person stuProxy = (Person) Proxy.newProxyInstance(Student.class.getClassLoader(), new Class[]{Person.class}, studentStiInvocation);
        stuProxy.giveMoney();

    }
}
