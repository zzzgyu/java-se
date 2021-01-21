package com.allweing.day1;

/**
 * @auther: zzzgyu
 */

public class Goods {

    String friut;

    protected String get() {
        return "goods-mm";
    }

    String say() {
        System.out.println(friut);
        System.out.println("goods-say");
        return friut;
    }

    void set(String i) {
        this.friut= i;
    }


}
