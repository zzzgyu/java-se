package com.allweing.desigenpattern.one;

/**
 * @auther: zzzgyu
 */

public class Test {
    public static void main(String[] args) {
        Person student = new Student();

        Person studentProxy = new StudentProxy(student);
        studentProxy.giveM();
    }
}
