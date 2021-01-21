package com.allweing.day11.person;

/**
 * @auther: zzzgyu
 */

public class PersonImpl implements Person {
    @Override
    public void personSay() {
        System.out.println("PersonImpl==============personSay()");
    }

    @Override
    public void parentSay() {
        System.out.println("PersonImpl=================parentSay()");
    }
}
