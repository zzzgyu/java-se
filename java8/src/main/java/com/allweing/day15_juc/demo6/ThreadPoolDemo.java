package com.allweing.day15_juc.demo6;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @auther: zzzgyu
 */

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 5, 3l, TimeUnit.SECONDS, new LinkedBlockingQueue<>(100), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        for (int i = 1; i <=105; i++) {

            threadPoolExecutor.execute(() -> {

                System.out.println(Thread.currentThread().getName()+"办理业务");
            });
        }
        threadPoolExecutor.shutdown();
    }
}
