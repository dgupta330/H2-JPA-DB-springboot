package com.example.springbootwebdemouserdb;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    int id;
    String name;
    String age;
    String pwd;
    String mobile;

    public User(int id, String name, String age, String pwd, String mobile) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.pwd = pwd;
        this.mobile = mobile;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
