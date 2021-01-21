package com.allweing.day15_juc.thread_utils;

import java.util.concurrent.CountDownLatch;

/**
 * @auther: zzzgyu
 */

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 1; i <=6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+"==="+"离开教室");
                countDownLatch.countDown();
            }).start();

        }
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName()+"==="+"离开教室");
    }
}
