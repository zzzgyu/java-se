package com.allweing.day15_juc;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @auther: zzzgyu
 */

public class Test1 {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        FutureTask futureTask = new FutureTask<>(numThread);
        new Thread(futureTask).start();

        try {
            Object o = futureTask.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
