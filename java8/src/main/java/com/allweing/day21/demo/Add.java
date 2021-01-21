package com.allweing.day21.demo;

import java.util.*;

/**
 * @auther: zzzgyu
 */

public class Add {

    List<User> users;

    public Add() {
        this.getUsers();
    }

    public List<User> getUsers() {
        users = new ArrayList<>();
        for (int i = 1; i <=20; i++) {
            User user = new User();
            user.setId(i);
            user.setName("lili"+i);
            user.setAccount(Arrays.asList("aa"+i,"bb"+i,"cc"+i));
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(i+"", UUID.randomUUID().toString());
            user.setMap(hashMap);
            users.add(user);
        }
        return users;
    }
}
