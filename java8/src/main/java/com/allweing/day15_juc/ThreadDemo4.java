package com.allweing.day15_juc;

import java.util.concurrent.*;

/**
 * @auther: zzzgyu
 */

public class ThreadDemo4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(new Demo4());
        executorService.execute(new Demo4());
        executorService.execute(new Demo4());
        executorService.execute(new Demo4());
        executorService.execute(new Demo4());
        executorService.execute(new Demo4());
        executorService.execute(new Demo4());
        Future future = executorService.submit(new Demo04());
        System.out.println(future.get().toString());
        executorService.shutdown();
    }
}

class Demo4 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"@"+"===============");
    }
}

class Demo04 implements Callable{
    @Override
    public Integer call() throws Exception {
        System.out.println("====");
        return 1;
    }
}