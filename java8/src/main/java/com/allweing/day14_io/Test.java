package com.allweing.day14_io;

import java.util.Scanner;

/**
 * @auther: zzzgyu
 * io :
 */

public class Test {
    public static void main(String[] args) {
//        File file = new File("F:\\myfile\\day14");
//        boolean b = file.mkdirs();
//        System.out.println(b);
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String next = scanner.next();
            System.out.println(next);
        }

    }
}
