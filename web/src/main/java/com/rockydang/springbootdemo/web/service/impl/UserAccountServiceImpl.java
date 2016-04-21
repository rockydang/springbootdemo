package com.rockydang.springbootdemo.web.service.impl;

import com.rockydang.springbootdemo.web.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * Created by yanxiao on 16/4/21.
 */
@Service
public class UserAccountServiceImpl implements AccountService {

    @Override
    public void queryAccountInfo() {
        System.out.println("112");
    }
}
