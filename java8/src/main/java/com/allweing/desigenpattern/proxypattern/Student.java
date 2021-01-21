package com.allweing.desigenpattern.proxypattern;

/**
 * @auther: zzzgyu
 */

public class Student implements Person {
    @Override
    public void giveMoney() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("student give money");
    }
}
