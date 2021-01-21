package com.allweing.day13;

import java.util.ArrayList;

/**
 * @auther: zzzgyu
 */

public class Test5 {
    public static void main(String[] args) {
        String s = "lolo";
        Student student = new Student("lili",19);
        student.setPname("jack");
        String pname = student.getPname();
        student.out();

        if (student instanceof Student) {
            System.out.println("true");
        }
        Face.speak();
        ArrayList<String> strings = new ArrayList<>();


    }

}
