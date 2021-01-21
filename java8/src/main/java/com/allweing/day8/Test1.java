package com.allweing.day8;

import java.lang.reflect.*;
import java.util.ArrayList;

/**
 * @auther: zzzgyu
 */

public class Test1 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

//        String a = "aaa";
//        Class<? extends String> aClass = a.getClass();
//        String s = aClass.newInstance();
//        System.out.println(s.toString());

        User user = new User();
        Class<? extends User> aClass1 = user.getClass();

        Class<?> aClass = Class.forName("cn.allweing.day8.User");
        Class<User> aClass2 = User.class;

        User user3 = (User) aClass.newInstance();
        User user4 = (User) aClass.newInstance();

        User user1 = aClass2.newInstance();
        System.out.println(user1.getAge());

        User user2 = aClass1.newInstance();
        System.out.println(user2.getAge());


        System.out.println(user1.getName());
        System.out.println(user2.getName());
        System.out.println(user3.getName());
        System.out.println(user4.getName());
        System.out.println("------------------------");
        System.out.println(aClass.getName());
        System.out.println(aClass.getClassLoader());
        System.out.println(aClass.getComponentType());
        System.out.println(aClass.getSuperclass());
        System.out.println("----------------------------");
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getModifiers());
        System.out.println(Modifier.toString(3));
        System.out.println(1&8);

        System.out.println("*********************************");
        Field[] fields = aClass.getDeclaredFields();
        ArrayList<String> list = new ArrayList<>();
        for (Field a : fields) {
            String name = a.getName();
            String s = Modifier.toString(a.getModifiers());
            String simpleName = a.getType().getSimpleName();

            String fileName = s+" "+simpleName+" "+name;
            list.add(fileName);
        }
        System.out.println(list);


        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        Method[] methods = aClass.getDeclaredMethods();

        for (Method m : methods) {

            System.out.println(m.getName());
            System.out.println(m.getReturnType().getSimpleName());
            System.out.println(Modifier.toString(m.getModifiers()));
            Parameter[] parameters = m.getParameters();
            System.out.println(parameters.length);
            for (Parameter p : parameters) {
                System.out.println("*"+p.getName());
                System.out.println("*"+p.getType().getSimpleName());
            }
            System.out.println("=================");

        }
        System.out.println("-------------------------------------------");

        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        System.out.println(declaredConstructors.length);
        for (Constructor d : declaredConstructors) {
            System.out.println(d.getName());


        }

        System.out.println("+++++++++++++++++++++++++++++++++");
        try {
            Constructor<? extends User> aClass1Constructor = aClass1.getConstructor(String.class, Integer.class);
            User mm = aClass1Constructor.newInstance("mm", 10);
            System.out.println(mm.getName());


        } catch (NoSuchMethodException e) {
            e.printStackTrace();

        } catch (InvocationTargetException e) {
            e.printStackTrace();

        }

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        User a = aClass1.newInstance();
        try {
            Method setName = aClass1.getMethod("setName", String.class);
            setName.invoke(a,"kk");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();

        } catch (InvocationTargetException e) {
            e.printStackTrace();

        }

        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        Class<User> u = User.class;

        try {
            User i = u.newInstance();
            Field name = u.getDeclaredField("name");
            name.setAccessible(true);
            System.out.println((String) name.get(i));
            name.set(i,"oo");
            System.out.println((String) name.get(i));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }


    }
}
