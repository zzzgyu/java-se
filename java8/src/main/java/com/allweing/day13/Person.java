package com.allweing.day13;

/**
 * @auther: zzzgyu
 */

public class Person {
    private String pname;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return pname != null ? pname.equals(person.pname) : person.pname == null;
    }

    @Override
    public int hashCode() {
        return pname != null ? pname.hashCode() : 0;
    }
}
