package com.allweing.day13;

/**
 * @auther: zzzgyu
 */

public class Test4 {
    public static void main(String[] args) {
        String s = "/path";

        String[] path = new String[]{"/path","/leyou","/user/name"};

        for (String s1 : path) {
            boolean b = s.startsWith(s1);
            if (b) {
                System.out.println(b);
            }
        }
    }
}
