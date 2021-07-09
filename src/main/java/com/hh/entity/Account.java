package com.hh.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description:
 * @author: lianghaohong
 * @date: 2021/7/9
 * @time: 11:03 上午
 * Copyright (C) 2021 Meituan All rights reserved
 */
public class Account implements Serializable {
    private String name;
    private BigDecimal money;

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
