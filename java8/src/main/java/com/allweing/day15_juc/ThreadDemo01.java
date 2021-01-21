package com.allweing.day15_juc;

/**
 * @auther: zzzgyu
 * 创建线程方式一
 */

public class ThreadDemo01 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.setName("线程1");
        demo.start();
    }
}

class Demo extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName()+"@"+"===================");
    }
}
