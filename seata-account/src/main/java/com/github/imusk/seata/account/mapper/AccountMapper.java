package com.github.imusk.seata.account.mapper;

import com.github.imusk.seata.entity.Order;

import java.util.Map;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-30 12:42
 * @classname: AccountMapper
 * @description: AccountMapper
 */
public interface AccountMapper {

    /**
     * 账户扣钱
     */
    void decrease(Map map);

}
