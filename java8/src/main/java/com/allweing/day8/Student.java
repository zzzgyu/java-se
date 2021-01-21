package com.allweing.day8;

import java.io.Serializable;

/**
 * @auther: zzzgyu
 */

public class Student extends User implements Serializable {

    private String name;
    private Integer age;
    private String school;

    public Student(String name, Integer age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }



    public String getName() {
        System.out.println("name");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
