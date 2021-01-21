package com.allweing.day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @auther: zzzgyu
 */

public class Test3 {
    public static void main(String[] args) throws IOException {
        char read;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入q退出：");

        do {
             read = (char)bufferedReader.read();
            System.out.println(read);
        }while (read!='q');
    }
}
