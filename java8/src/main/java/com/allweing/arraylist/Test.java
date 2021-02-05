package com.allweing.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/**
 * @auther: zzzgyu
 * arraylist 源码分析
 */

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");
        arrayList.ensureCapacity(20);
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
        Vector<String> strings = new Vector<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        Iterator<String> iterator1 = strings.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

    }
}
