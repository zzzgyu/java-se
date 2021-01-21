package com.allweing.day10;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

/**
 * @auther: zzzgyu
 */

public class Test1 {

    @MyAnnotation
    public void say(String name,Integer age) {
        System.out.println("我的名字是："+name);
    }

    public void speak() {
        System.out.println("name");
    }


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Test1 test1 = new Test1();

        Class<Test1> test1Class = Test1.class;

        Method say = test1Class.getMethod("say",new Class[]{String.class,Integer.class});
        Method speak = test1Class.getMethod("speak");
        speak.invoke(test1);

        say.invoke(test1,new Object[]{"lilo",11});

        interceptorAnnotation(say);

    }

    public static void interceptorAnnotation(Method method) {

        String[] s1 = {"mm","dd"};

        System.out.println(Arrays.toString(s1));

        if (method.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println("=======================");
            String[] value = annotation.value();
            for (String s : value) {
                System.out.println(s);
            }
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {

            }

        }
    }
}
