package com.allweing.day6;

/**
 * @auther: zzzgyu
 */

public class Test6 {
    public static void main(String[] args) {

        UserChild userChild = new UserChild();


    }
}

class UserSuper {
    public String s1 = "tt";
    public static void say() {
        System.out.println("UserSuper--------------say");
    }
}

class UserChild extends UserSuper {

}
