package com.allweing.day15_juc;

import java.util.concurrent.Callable;

/**
 * @auther: zzzgyu
 */

public class NumThread implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("运行了该方法");
        int i=1/0;
        return 1;
    }
}
