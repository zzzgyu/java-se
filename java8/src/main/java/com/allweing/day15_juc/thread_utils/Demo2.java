package com.allweing.day15_juc.thread_utils;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @auther: zzzgyu
 */

public class Demo2 {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> System.out.println("召唤神龙"));
        for (int i = 1; i <=7; i++) {
            int tem = i;
            new Thread(() -> {
                System.out.println("收集到第"+tem+"龙珠");
                try {
                    cyclicBarrier.await();
                    System.out.println("===="+tem);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
