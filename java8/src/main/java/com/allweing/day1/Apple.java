package com.allweing.day1;

/**
 * @auther: zzzgyu
 */

public class Apple extends Goods {

    @Override
    protected String get() {
        return super.get();
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.get();
    }
}
