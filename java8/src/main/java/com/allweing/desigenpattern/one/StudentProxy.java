package com.allweing.desigenpattern.one;

/**
 * @auther: zzzgyu
 */

public class StudentProxy implements Person {
    Person t;

    public StudentProxy(Person t) {
        this.t = t;
    }

    @Override
    public void giveM() {
        t.giveM();
    }
}
