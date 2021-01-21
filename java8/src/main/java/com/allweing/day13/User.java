package com.allweing.day13;

/**
 * @auther: zzzgyu
 */

public class User {
    private String name;

    public User() {
        System.out.println("User类创建---------------------");
        this.name="lili0";
    }

    public void say() {
        System.out.println("user=============say()"+name);
    }
}
