package com.allweing.day18;

/**
 * @auther: zzzgyu
 */

public class Test {
    public static void main(String[] args) {
        String a = "F:com\\leyou\\controller\\user.class";
        System.out.println(a.indexOf("com"));
        System.out.println(a.indexOf(".class"));

        String com = a.substring(a.indexOf("com"), a.indexOf(".class")).replace("\\",".");
        System.out.println(com);

    }
}
