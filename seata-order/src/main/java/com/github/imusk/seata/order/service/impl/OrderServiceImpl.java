package com.github.imusk.seata.order.service.impl;

import com.github.imusk.seata.entity.Order;
import com.github.imusk.seata.order.mapper.OrderMapper;
import com.github.imusk.seata.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-30 12:45
 * @classname: OrderServiceImpl
 * @description: OrderServiceImpl
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void createOrder(Order order) {
        orderMapper.createOrder(order);
    }


}
