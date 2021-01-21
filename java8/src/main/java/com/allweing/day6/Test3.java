package com.allweing.day6;

import java.lang.reflect.Field;
import java.util.Objects;

/**
 * @auther: zzzgyu
 */

public class Test3 {
    public static void main(String[] args) throws NoSuchFieldException {
        int a=1;

        User user = new User();
        user.name="zhu";
        user.age = 16;
        user.hao = 18.00;
        System.out.println("--------------------");
        user.say(a);
        System.out.println(a);
        speak(user);
        System.out.println("main----------:"+user.name);
        Class<? extends User> aClass = user.getClass();
        Field name = aClass.getDeclaredField("name");
        System.out.println("=====================");
        System.out.println(name.toString());


    }

    public static void speak(User user) {
        user.age=99;
        user.name="lili";
        user.hao=99.00;
        System.out.println("speak---------name:"+user.name);

    }

}

class User{
    public String name="zhang";
    public int age = 12;
    public double hao = 12.00;


    public void say(int a) {
        a++;
        System.out.println(a);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Double.compare(user.hao, hao) == 0 &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hao);
    }
}
