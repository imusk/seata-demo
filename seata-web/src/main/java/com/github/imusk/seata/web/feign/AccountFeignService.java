package com.github.imusk.seata.web.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-30 13:06
 * @classname: AccountFeignService
 * @description: AccountFeignService
 */
@FeignClient("seata-account")
public interface AccountFeignService {

    /**
     * 帐号扣钱
     * @param amount
     * @param userId
     * @return
     */
    @PostMapping("/seata/account/decrease")
    public boolean decrease(@RequestParam("amount") Integer amount, @RequestParam("userId") Integer userId);

}
