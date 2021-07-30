package com.github.imusk.seata.order.service;

import com.github.imusk.seata.entity.Order;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-30 12:45
 * @classname: OrderService
 * @description: OrderService
 */
public interface OrderService {

    public void createOrder(Order order);

}
