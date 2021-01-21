package com.allweing.day05;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @auther: zzzgyu
 */
@SuppressWarnings("all")
public class Test4 {
    public static void main(String[] args) {
        FutureTask<Integer> futureTask = new FutureTask<>(new Student());

        //futureTask.run();
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}

@SuppressWarnings("all")
class Student implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("call-------------------");
        return 0;
    }
}