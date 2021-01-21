package com.allweing.day21;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @auther: zzzgyu
 */

public class StudentProxy implements InvocationHandler {

    Student student;
    public StudentProxy(Student student) {
        this.student = student;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("==================================================");
        System.out.println("method"+method.getName());
        Object invoke = method.invoke(student, args);
        System.out.println("---------------------");
        return invoke;
    }
}
