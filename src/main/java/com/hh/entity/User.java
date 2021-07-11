package com.hh.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: lianghaohong
 * @date: 2021/7/9
 * @time: 10:56 上午
 * Copyright (C) 2021 Meituan All rights reserved
 */
public class User implements Serializable {
    private String username;
    private String password;
    private String sex;
    private Date birthday;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
