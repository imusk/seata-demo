package com.github.imusk.seata.order.controller;

import com.github.imusk.seata.entity.Order;
import com.github.imusk.seata.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-30 12:46
 * @classname: OrderController
 * @description: OrderController
 */
@RestController
@RequestMapping("/seata/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    /**
     * 創建訂單
     * @param order
     * @return
     */
    @PostMapping("/createOrder")
    public boolean createOrder(@RequestBody Order order) {
        System.out.println("Order : " + order);

        order.setOrderNo(UUID.randomUUID().toString());
        orderService.createOrder(order);

        return true;
    }

}
