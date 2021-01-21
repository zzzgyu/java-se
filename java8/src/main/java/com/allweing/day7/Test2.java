package com.allweing.day7;

/**
 * @auther: zzzgyu
 */

public class Test2 {
    public static void main(String[] args) {
        A<String> a = new A<>();
        a.setName("mm");
        System.out.println(a.getName());

    }
}

//泛型类
class A<T>{
    T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}