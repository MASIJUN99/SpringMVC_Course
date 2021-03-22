package com.sample.domain;

import java.io.Serializable;

public class User implements Serializable {
    private String uname;
    private Integer age;

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUname() {
        return uname;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                '}';
    }

}
