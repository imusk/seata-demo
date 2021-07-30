package com.github.imusk.seata.account.controller;

import com.github.imusk.seata.account.service.AccountService;
import com.github.imusk.seata.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-30 12:46
 * @classname: AccountController
 * @description: AccountController
 */
@RestController
@RequestMapping("/seata/account")
public class AccountController {

    @Autowired
    private AccountService accountService;


    /**
     * 给指定用户扣钱
     * @param amount
     * @param userId
     * @return
     */
    @PostMapping("/decrease")
    public boolean decrease(@RequestParam("amount") Integer amount, @RequestParam("userId") Integer userId) {
        System.out.println("Amount : " + amount);
        System.out.println("UserId : " + userId);

        // TODO 模拟异常
        if (userId == null || userId == 1) {
            throw new RuntimeException("模拟异常.");
        }

        Map<String, Object> map = new HashMap<>();
        map.put("amount", amount);
        map.put("userId", userId);
        accountService.decrease(map);

        return true;
    }

}
