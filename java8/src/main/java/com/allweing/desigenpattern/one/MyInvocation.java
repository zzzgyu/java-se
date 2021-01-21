package com.allweing.desigenpattern.one;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @auther: zzzgyu
 */

public class MyInvocation implements InvocationHandler {
    Person person;

    public MyInvocation(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object invoke = method.invoke(person, args);
        return invoke;
    }
}
