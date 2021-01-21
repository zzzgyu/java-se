package com.allweing.day1;

/**
 * @auther: zzzgyu
 */

public class Teacher extends People {
    @Override
    protected void say() {
        System.out.println("say---Teacher");
        this.name="Teacher--";
    }

    @Override
    protected void speak() {
        //super.speak();
        System.out.println("Teacher--speak");
    }

    @Override
    public void he() {

    }
}
