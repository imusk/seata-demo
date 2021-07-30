package com.github.imusk.seata.entity;

import java.io.Serializable;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-30 12:23
 * @classname: Account
 * @description: 用户帐户表
 */
public class Account implements Serializable {

    /**
     * 编号
     */
    private Integer id;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 账户余额
     */
    private Integer balance;

    /**
     * 备注
     */
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
