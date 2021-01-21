package com.allweing.day15_juc.demo3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @auther: zzzgyu
 * 线程顺序调用
 */

public class ThreadDemo3 {
    public static void main(String[] args) {

        Num3 num3 = new Num3();

        new Thread(() -> {
            for (int i = 1; i <=10; i++) {
                num3.print5();
            }
        },"A").start();
        new Thread(() -> {
            for (int i = 1; i <=10; i++) {

                num3.print10();
            }
        },"B").start();

        new Thread(() -> {
            for (int i = 1; i <=10; i++) {

                num3.print15();
            }
        },"C").start();

    }
}

class Num3{

    private int mark = 1;//标志位

    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();
    public void print5() {
        lock.lock();
        try {

            while (mark != 1) {
                try {
                    condition1.await();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }

            for (int i = 0; i <= 5; i++) {

                System.out.println(Thread.currentThread().getName()+"--------------555555555");
            }
            mark=2;
            condition2.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void print10() {
        lock.lock();
        try {

            while (mark != 2) {
                try {
                    condition2.await();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }

            for (int i = 0; i <= 10; i++) {

                System.out.println(Thread.currentThread().getName()+"--------------10101010");
            }
            mark=3;
            condition3.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void print15() {
        lock.lock();
        try {

            while (mark != 3) {
                try {
                    condition3.await();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }

            for (int i = 0; i <= 15; i++) {

                System.out.println(Thread.currentThread().getName()+"--------------1515151515515");
            }
            mark=1;
            condition1.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}