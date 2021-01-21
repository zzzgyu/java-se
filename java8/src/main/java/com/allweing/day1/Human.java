package com.allweing.day1;

/**
 * @auther: zzzgyu
 * 关键字 protected 是一个限定符，它确保 finalize() 方法不会被该类以外的代码调用。
 */

public class Human {
    protected String sex="man";

    protected String age="woman";

    protected void say() {
        System.out.println("Human----say");
    }

    void speak() {
        System.out.println("Human----speak");
    }
}
