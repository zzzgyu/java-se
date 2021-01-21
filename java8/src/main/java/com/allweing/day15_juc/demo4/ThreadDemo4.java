package com.allweing.day15_juc.demo4;

import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @auther: zzzgyu
 */

public class ThreadDemo4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        CopyOnWriteArrayList<String> arrayList1 = new CopyOnWriteArrayList<>();


        for (int i = 1; i <=10; i++) {

            new Thread(() -> {
                arrayList1.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(Thread.currentThread().getName()+"============"+arrayList1);
            }).start();
        }
    }
}

