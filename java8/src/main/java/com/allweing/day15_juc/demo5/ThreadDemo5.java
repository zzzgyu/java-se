package com.allweing.day15_juc.demo5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @auther: zzzgyu
 */

public class ThreadDemo5 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService executorService = Executors.newSingleThreadExecutor();



                for (int i = 0; i < 10; i++) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    executorService.execute(() -> System.out.println(Thread.currentThread().getName()+"===="));
                }
                executorService.shutdown();


    }
}
