package com.allweing.day15_juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @auther: zzzgyu
 */

public class Test2 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        NumThread numThread = new NumThread();
        FutureTask futureTask = new FutureTask<>(numThread);
        service.submit(futureTask);

        service.shutdown();
    }
}
