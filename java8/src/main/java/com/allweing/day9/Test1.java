package com.allweing.day9;

import java.io.File;
import java.io.IOException;

/**
 * @auther: zzzgyu
 */

public class Test1 {
    public static void main(String[] args) {
        File file = new File("text.txt");
        boolean exists = file.exists();
        if (exists) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println(file.getAbsolutePath());
        try {
            String canonicalPath = file.getCanonicalPath();
            System.out.println(canonicalPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.getName());

    }
}
