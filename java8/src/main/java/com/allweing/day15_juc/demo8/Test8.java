package com.allweing.day15_juc.demo8;

import java.util.concurrent.TimeUnit;

/**
 * @auther: zzzgyu
 */

public class Test8 {
    public static void main(String[] args) {
        Num num = new Num();

        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
                num.add();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        while (num.i == 1) {

        }
        System.out.println("==========");
    }
}

class Num{
     int i = 1;

    public void add() {
        i+=1025;
        System.out.println(i);
    }
}
