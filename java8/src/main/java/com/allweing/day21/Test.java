package com.allweing.day21;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @auther: zzzgyu
 */

public class Test {
    public static void main(String[] args) {
        UserMapper o = (UserMapper) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{UserMapper.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("--------------------");
                System.out.println(method.getName());

                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                for (Annotation declaredAnnotation : declaredAnnotations) {
                    System.out.println(declaredAnnotation);
                }
                return null;

            }
        });

        User userById = o.findUserById(1);

        System.out.println(userById);
    }
}
