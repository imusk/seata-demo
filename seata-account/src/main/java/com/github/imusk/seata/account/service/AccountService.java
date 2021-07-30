package com.github.imusk.seata.account.service;

import com.github.imusk.seata.entity.Order;

import java.util.Map;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-30 12:45
 * @classname: AccountService
 * @description: AccountService
 */
public interface AccountService {

    /**
     * 账户扣钱
     */
    void decrease(Map map);

}
