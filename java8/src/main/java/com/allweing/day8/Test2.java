package com.allweing.day8;

import java.lang.reflect.*;

/**
 * @auther: zzzgyu
 * Java反射
 */

public class Test2 {

    public static void main(String[] args) {

//        try {
//            Class<?> aClass = Class.forName("cn.allweing.day8.Student");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        Student student = new Student();
//        Class<? extends Student> aClass = student.getClass();

        Class<Student> studentClass = Student.class;
        //得到类名
        System.out.println(studentClass.getSimpleName());
        //类的修饰符
        System.out.println(Modifier.toString(studentClass.getModifiers()));

        //类中的属性
        //所有属性的数组
        Field[] declaredFields = studentClass.getDeclaredFields();

        for (Field d : declaredFields) {
            //属性名
            String name = d.getName();
            //属性修饰符
            String field = Modifier.toString(d.getModifiers());
            //属性类型
            String fieldType = d.getType().getSimpleName();

            System.out.println(field + " " + fieldType + " " + name);

        }


        //类中的方法
        Method[] methods = studentClass.getDeclaredMethods();
        for (Method m : methods) {
            //方法的修饰符
            String methodsModifiers = Modifier.toString(m.getModifiers());
            //方法的返回类型
            String methodsType = m.getReturnType().getSimpleName();
            //方法的名称
            String methodsName = m.getName();
            //方法的参数数组
            Parameter[] parameters = m.getParameters();
            //参数的个数
            int length = parameters.length;
            //方法参数
            StringBuilder stringBuilder = new StringBuilder();

            for (Parameter p : parameters) {
                //方法参数类型
                String pName = p.getType().getSimpleName();
                stringBuilder.append(pName + " ");
            }
            System.out.println(methodsModifiers + " " + methodsType + " " + methodsName + " " + length + " " + stringBuilder);
        }

        //类的实例化,默认使用无参构造
        Student student;
        try {
            //调用有参构造
            Constructor<Student> studentClassConstructor = studentClass.getConstructor(String.class, Integer.class, String.class);
            student = studentClassConstructor.newInstance("lili", 14, "liangzhou");

            //调用无参构造
            //Student student = studentClass.newInstance();


            //获取对象的属性的值
            Field name = studentClass.getDeclaredField("name");
            //设置私有属性也可以访问
            name.setAccessible(true);
            String o = (String) name.get(student);
            System.out.println("对象属性的值：" + o);


            //获取调用对象的方法
            Method getName = studentClass.getDeclaredMethod("getName");
            System.out.println("888888888");
            String invoke = (String) getName.invoke(student);
            System.out.println("return:" + invoke);

            Method setName = studentClass.getMethod("setName", String.class);
            setName.invoke(student, "lulu");

            Method getName2 = studentClass.getDeclaredMethod("getName");
            System.out.println("****************");
            String invoke2 = (String) getName.invoke(student);
            System.out.println("return:" + invoke2);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }


    }
}
