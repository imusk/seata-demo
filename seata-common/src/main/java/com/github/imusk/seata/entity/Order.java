package com.github.imusk.seata.entity;

import java.io.Serializable;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-30 12:25
 * @classname: Order
 * @description: 订单表
 */
public class Order implements Serializable {

    /**
     * 编号
     */
    private Integer id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 购买数量
     */
    private Integer count;

    /**
     * 购买金额
     */
    private Integer amount;

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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
