package com.allweing.desigenpattern.proxypattern;

/**
 * @auther: zzzgyu
 * 静态代理
 */

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        StudentProxy studentProxy = new StudentProxy(student);
        studentProxy.giveMoney();
    }
}
