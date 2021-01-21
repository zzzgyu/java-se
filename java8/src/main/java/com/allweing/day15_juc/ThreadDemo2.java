package com.allweing.day15_juc;

/**
 * @auther: zzzgyu
 * 创建线程方式二
 */

public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Demo2(),"线程2");
        thread.start();
    }
}

class Demo2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"@"+"====================");
    }
}