package com.allweing.day4;


import java.util.ArrayList;
import java.util.HashSet;

/**
 * @auther: zzzgyu
 */

public class Test8 {
    public static void main(String[] args) {
//        System.out.println(Colors.BLUE);
//        Vector<String> stringVector = new Vector<>();
//        stringVector.add("hello");
//        stringVector.add("world");
//        System.out.println(stringVector.get(0));
//
//        String[] strings = new String[10];
//        strings[2]="ddd";
//        for (String  i:strings){
//            System.out.println(i);
//        }
        //集合的遍历
        ArrayList<String> list = new ArrayList<>();
        list.add("mm");
        list.add("dd");
        list.add("ll");
        list.add("pp");
        //（1）for 循环
//        for (java.lang.String i : list) {
//            System.out.println(i);
//        }
        list.forEach(a -> System.out.println(a));
//
//        //(2) 转成数组
//
////        String[] strings = list.toArray(new String[list.size()]);
////        System.out.println();
//
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        Data[] data = new Data[3];
//        data[0]=new Data("lili","12");
//        data[2]=new Data("wuwu","14");
//        data[1]=new Data("yuyu","12");
//        System.out.println(data[1].toString());
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("mm");
        hashSet.add("ll");
        hashSet.add("pp");
        hashSet.add("mm");
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);
        hashSet.forEach(a-> System.out.println(a));


    }
}
