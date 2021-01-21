package com.allweing.desigenpattern.proxypattern;

/**
 * @auther: zzzgyu
 */

public class MonitorUtil {
    public static ThreadLocal<Long> t1 = new ThreadLocal<>();

    public static void start() {
        t1.set(System.currentTimeMillis());
    }

    public static void end() {
        long l = System.currentTimeMillis();

        System.out.println("耗时："+(l - t1.get())+"ms");
    }
}
