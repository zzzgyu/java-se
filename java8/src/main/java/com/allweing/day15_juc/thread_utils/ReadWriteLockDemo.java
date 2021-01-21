package com.allweing.day15_juc.thread_utils;

/**
 * @auther: zzzgyu
 */

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @auther: zzzgyu
 * 读写锁
 */
class MyCache{
    private volatile Map<String, Object> hashMap = new HashMap<>();
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public void put(String k, Object v) {

        readWriteLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"正在写入数据"+k);
            hashMap.put(k, v);
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName()+"写入数据完成");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            readWriteLock.writeLock().unlock();
        }


    }

    public void get(String k) {
        readWriteLock.readLock().lock();

        try {
            System.out.println(Thread.currentThread().getName()+"正在读取数据");
            Object o = hashMap.get(k);
            System.out.println(Thread.currentThread().getName()+"读取数据完成"+o);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            readWriteLock.readLock().unlock();
        }

    }

}

public class ReadWriteLockDemo {
    public static void main(String[] args) {
        MyCache myCache = new MyCache();
        for (int i = 0; i < 11; i++) {
            final int tem=i;
            new Thread(()->{
                myCache.put(tem+"",tem+"sss");
            }).start();
        }

        for (int i = 0; i < 11; i++) {
            final int tem=i;
            new Thread(()->{
                myCache.get(tem+"");
            }).start();
        }
    }
}

