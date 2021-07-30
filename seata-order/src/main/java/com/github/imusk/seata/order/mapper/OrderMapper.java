package com.github.imusk.seata.order.mapper;

import com.github.imusk.seata.entity.Order;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-30 12:42
 * @classname: OrderMapper
 * @description: OrderMapper
 */
public interface OrderMapper {

    void createOrder(Order order);

}
