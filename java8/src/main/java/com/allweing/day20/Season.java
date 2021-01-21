package com.allweing.day20;

/**
 * @auther: zzzgyu
 */

public enum  Season {
    Spring(100,"春天"),Summer(200,"夏天"),Autumn(300,"秋天"),Winter(400,"夏天");

    Integer code;
    String name;

    Season(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
