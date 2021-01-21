package com.allweing.day15_juc.demo8;

/**
 * @auther: zzzgyu
 */

class Code{
    public Code() {
        System.out.println("Code******************666666666666666666");
    }

    static {
        System.out.println("Code*********************4444444444444");
    }
    {
        System.out.println("Code**********************555555555555");
    }
}

public class T3 {
    static {
        System.out.println("T3*****static*****2222222222222222");
    }
    {
        System.out.println("T3*****wu****3333333333333333333");
    }
    public static void main(String[] args) {
        System.out.println("T3********************11111111111111");
        new Code();
        System.out.println("----------------------");
        new Code();
        System.out.println("-----------------------");
        new T3();
    }
}