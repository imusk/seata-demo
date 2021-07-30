package com.github.imusk.seata.web.controller;

import com.github.imusk.seata.entity.Order;
import com.github.imusk.seata.web.feign.AccountFeignService;
import com.github.imusk.seata.web.feign.OrderFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-30 13:09
 * @classname: TestController
 * @description: TestController
 */
@RestController
@RequestMapping("/seata/test")
public class TestController {

    @Resource
    private OrderFeignService orderFeignService;

    @Resource
    private AccountFeignService accountFeignService;

    /**
     * 下单：1.创建订单，2.帐号扣钱
     * @param order
     * @return
     */
    @PostMapping("/shopping")
    public boolean shopping(Order order) {

        // 1.创建订单
        orderFeignService.createOrder(order);

        // 2.帐号扣钱
        accountFeignService.decrease(order.getAmount(), order.getUserId());

        return true;
    }


}
