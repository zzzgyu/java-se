package com.allweing.day7;


/**
 * @auther: zzzgyu
 */

public class Test1 {
    public static void main(String[] args) {
        String a = new String("abc");

        String b = new String("abc");

        String c = "abc";

        System.out.println(a==b);//f
        System.out.println(a.equals(b));//t
        System.out.println(a==c);//f
        System.out.println(a.equals(c));//t
    }
}
