package com.allweing.day15_juc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @auther: zzzgyu
 */

public class ThreadDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new Demo3());

        Thread thread = new Thread(futureTask);
        thread.start();
        Integer integer = futureTask.get();
        System.out.println(integer);

    }
}

class Demo3 implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName()+"@"+"===============");
            //int i=1/0;
            return 1;
        } catch (Exception e) {

            return 2;
        }
    }
}