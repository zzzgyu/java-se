package com.allweing.day6;

import java.util.Objects;

/**
 * @auther: zzzgyu
 */

public class Test4 {
    public static void main(String[] args) {

        Student student = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();

        System.out.println(student==student2);
        System.out.println(student.equals(student2));

    }
}

class Student implements Cloneable{

    public String name = "zhu";
    public Integer age = 13;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

     void just() {
        System.out.println("ll");
    }

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}