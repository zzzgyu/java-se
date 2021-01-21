package com.allweing.day6;

/**
 * @auther: zzzgyu
 */

public class Test5 {
    public static void main(String[] args) {
        User11 user11 = new User11();

    }
}

class User10{

    public User10(){
        System.out.println("user10");
    }
}

class User11 extends User10{
    public User11() {
        super();
        System.out.println("user11");
    }
}
