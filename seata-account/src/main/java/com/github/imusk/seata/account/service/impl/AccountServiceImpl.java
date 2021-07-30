package com.github.imusk.seata.account.service.impl;

import com.github.imusk.seata.account.mapper.AccountMapper;
import com.github.imusk.seata.account.service.AccountService;
import com.github.imusk.seata.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-30 12:45
 * @classname: AccountServiceImpl
 * @description: AccountServiceImpl
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;


    @Override
    public void decrease(Map map) {
        accountMapper.decrease(map);
    }
}
