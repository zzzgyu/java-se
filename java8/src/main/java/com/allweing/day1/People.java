package com.allweing.day1;

/**
 * @auther: zzzgyu
 */

public abstract class People implements Thing {
    protected String name;
    protected abstract void say();

     void speak() {
        System.out.println("speak---People");
    }


}
