package com.allweing.day13;

import java.util.Arrays;

/**
 * @auther: zzzgyu
 */

class MyData{
    int a = 10;
}

public class Demo3 {
    public static void main(String[] args) {
        int i =1;
        String s = "hello";
        Integer a = 2;
        int[] arr = {1,2,3,4,5};
        MyData myData = new MyData();
        change(i,s,a,arr,myData);
        System.out.println("i:"+i);
        System.out.println("s:"+s);
        System.out.println("a:"+a);
        System.out.println("arr:"+ Arrays.toString(arr));
        System.out.println("mydata:"+myData.a);

    }

    public static void change(int i,String s,Integer a,int[] arr, MyData myData) {
        i+=1;
        s+="world";
        a+=1;
        arr[0]=2;
        myData.a=11;
        /*arr[0]+=1;
        myData.a+=1;*/
    }
}