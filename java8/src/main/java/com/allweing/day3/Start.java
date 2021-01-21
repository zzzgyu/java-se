package com.allweing.day3;

/**
 * @auther: zzzgyu
 */

public class Start {
    public static void main(String[] args)
    {
        A a=new A();
        B b=new B();
        C c=new C();
        D d=new D();
        speak(a);
        speak(b);
        speak(c);
        speak(d);
    }

    static void speak(Object obj)
    {
        if(obj instanceof A)//意思是：如果参数是 A 类，那么就执行一下语句
        {
            A aobj=(A)obj;//这里是向下转换，需要强制转换
            aobj.axx();
        }
        else if(obj instanceof B)
        {
            B bobj=(B)obj;
            bobj.bxx();
        }
        else if(obj instanceof C)
        {
            C cobj=(C)obj;
            cobj.cxx();
        }
    }
}

class A
{
    void axx()
    {
        System.out.println("Good morning!");
        System.out.println("This is A");
    }
}

class B
{
    void bxx()
    {
        System.out.println("Holle!");
        System.out.println("This is B");
    }
}

class C
{
    void cxx()
    {
        System.out.println("Look!");
        System.out.println("This is C");
    }
}

class D
{
    void dxx()
    {
        System.out.println("Oh!Bad!");
        System.out.println("This is D");
    }
}