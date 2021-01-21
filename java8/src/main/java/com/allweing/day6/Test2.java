package com.allweing.day6;

import java.io.*;

/**
 * @auther: zzzgyu
 */

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\doc\\text1.txt");
       // File file1 = new File("E:\\doc\\text1.txt");

        try {
            byte bWrite[] = { 11, 21, 3, 40, 5 };
            OutputStream os = new FileOutputStream(file);
            OutputStreamWriter writer = new OutputStreamWriter(os, "utf-8");
            for (int x = 0; x < bWrite.length; x++) {
                writer.write(bWrite[x]); // writes the bytes
            }
            os.close();


        } catch (IOException e) {
            System.out.print("Exception");
        }
    }



}
