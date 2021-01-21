package com.allweing.day21.demo;

import java.util.List;

/**
 * @auther: zzzgyu
 */

public class Test {
    public static void main(String[] args) {
        Add add = new Add();
        List<User> users = add.users;
        users.forEach(s->{
            System.out.println(s.getName());
        });
        System.out.println("-------------------end--------------");
    }
}
