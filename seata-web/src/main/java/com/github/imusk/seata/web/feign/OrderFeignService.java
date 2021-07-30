package com.github.imusk.seata.web.feign;

import com.github.imusk.seata.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-30 13:06
 * @classname: OrderFeignService
 * @description: OrderFeignService
 */
@FeignClient("seata-order")
public interface OrderFeignService {

    /**
     * 创建订单
     * @param order
     * @return
     */
    @PostMapping("/seata/order/createOrder")
    public boolean createOrder(@RequestBody Order order);

}
