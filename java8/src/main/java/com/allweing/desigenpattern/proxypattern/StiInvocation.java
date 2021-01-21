package com.allweing.desigenpattern.proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @auther: zzzgyu
 */

public class StiInvocation<T> implements InvocationHandler {

    T target;
    public StiInvocation(T student) {
        this.target = student;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MonitorUtil.start();

        Object invoke = method.invoke(target, args);

        MonitorUtil.end();

        return invoke;

    }
}
