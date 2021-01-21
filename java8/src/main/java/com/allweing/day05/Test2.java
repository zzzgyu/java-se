package com.allweing.day05;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @auther: zzzgyu
 */

public class Test2 {
    public static void main(String[] args) {

        User2 user2 = new User2();

        FutureTask task = new FutureTask<Integer>(user2);
        new Thread(task).start();
        try {
            System.out.println("-------------------");
            System.out.println((int) task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}

class User2 implements Callable{
    @Override
    public Object call() throws Exception {
        System.out.println("callable---------");
        return 1;
    }
}