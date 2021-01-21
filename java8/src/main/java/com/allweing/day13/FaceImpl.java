package com.allweing.day13;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: zzzgyu
 */

public class FaceImpl implements Face {

    ThreadLocal<Map<String,String>> local = new ThreadLocal<Map<String,String>>();
    @Override
    public void say() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1","name");
        local.set(hashMap);
    }

    public void speak() {
        Map<String, String> map = local.get();
        String s = map.get("1");
    }

}
