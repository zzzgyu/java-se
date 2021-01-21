package com.allweing.day15_juc.demo2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @auther: zzzgyu
 * 生产者---------消费者
 */

public class Test {
    public static void main(String[] args) {
        Num num = new Num();
        new Thread(() -> {
            for (int i = 1; i <=30; i++) {
                try {
                    num.add();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();
        new Thread(() -> {
           for (int i = 1; i <=30; i++) {
               try {
                   num.reduce();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }

        },"B").start();
        new Thread(() -> {
           for (int i = 1; i <=30; i++) {
               try {
                   num.add();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        },"C").start();
        new Thread(() -> {
          for (int i = 1; i <=30; i++) {
              try {
                  num.reduce();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
        },"D").start();

    }
}

class Num{

    private static int num = 0;
    /*//方法一
    public synchronized void add() throws InterruptedException {
        while (num != 0) {
            this.wait();
        }
        num++;
        System.out.println(Thread.currentThread().getName()+"========"+num);
        notifyAll();
    }

    public synchronized void reduce() throws InterruptedException {
        while (num == 0) {
            this.wait();
        }
        num--;
        System.out.println(Thread.currentThread().getName()+"=========="+num);
        notifyAll();
    }*/

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void add() throws InterruptedException {
        lock.lock();
        while (num != 0) {
           condition.await();
        }
        num++;
        System.out.println(Thread.currentThread().getName()+"========"+num);
        condition.signalAll();
        lock.unlock();
    }

    public void reduce() throws InterruptedException {
        lock.lock();
        while (num == 0) {
            condition.await();
        }
        num--;
        System.out.println(Thread.currentThread().getName()+"========"+num);
        condition.signalAll();
        lock.unlock();
    }

}
