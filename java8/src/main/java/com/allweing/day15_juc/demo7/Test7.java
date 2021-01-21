package com.allweing.day15_juc.demo7;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @auther: zzzgyu
 */

public class Test7 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("==================");
            //int i=1/0;
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 1;
        });

        CompletableFuture<Integer> integerCompletableFuture = completableFuture.whenComplete((integer, throwable) -> {
            System.out.println("成功输出" + integer);
            //System.out.println("fail" + throwable);
        }).exceptionally(throwable -> {
            System.out.println(throwable);
            return 4;
        });
        integerCompletableFuture.get();
    }
}
