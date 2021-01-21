package com.allweing.day15_juc.demo1;

/**
 * @auther: zzzgyu
 *
 * 买票问题
 * 40 人 抢 30张票
 */

public class Test {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(() -> {
            for (int i = 1; i <=40; i++) {
                ticket.sale();
            }
        },"A").start();
        new Thread(() -> {
            for (int i = 1; i <=40; i++) {
                ticket.sale();
            }
        },"B").start();
        new Thread(() -> {
            for (int i = 1; i <=40; i++) {
                ticket.sale();
            }
        },"C").start();
        new Thread(() -> {
            for (int i = 1; i <=40; i++) {
                ticket.sale();
            }
        },"D").start();

    }
}

class Ticket{

    static int t = 30;

   synchronized void sale() {
        if (t > 0) {
            System.out.println(Thread.currentThread().getName()+"买出了第"+t+"张票");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t--;
        }
    }

}
