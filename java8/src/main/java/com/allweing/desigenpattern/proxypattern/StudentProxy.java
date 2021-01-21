package com.allweing.desigenpattern.proxypattern;

/**
 * @auther: zzzgyu
 */

public class StudentProxy implements Person {
    Student student;
    public StudentProxy(Student student) {
        this.student = student;
    }

    @Override
    public void giveMoney() {
        student.giveMoney();
    }
}
