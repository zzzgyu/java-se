package com.allweing.day13;

/**
 * @auther: zzzgyu
 */

public class Student extends Person {

     String name;
     Integer age;



    public Student() {
        System.out.println("student=============无参构造");
    }

    public Student(String name, Integer age) {
        this();
        this.name = name;
        this.age = age;

        System.out.println("student+++++++++==有参构造");
    }

    public void out() {
        System.out.println("name:"+name+"age"+age);
    }


}
