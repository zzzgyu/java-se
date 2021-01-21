package com.allweing.day21.demo;

import java.util.List;
import java.util.Map;

/**
 * @auther: zzzgyu
 */

public class User {
    private String name;
    private Integer id;
    private List<String> account;
    private Map<String,Object> map;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getAccount() {
        return account;
    }

    public void setAccount(List<String> account) {
        this.account = account;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
