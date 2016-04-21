package com.rockydang.springbootdemo.web.web.controller;

import com.rockydang.springbootdemo.web.conf.Config;
import com.rockydang.springbootdemo.web.service.impl.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yanxiao on 16/4/21.
 */
@RestController
public class Example {

    @Autowired
    Config config;

    @Autowired
    ConnectionService connectionService;

    @RequestMapping("/")
    String home() {
        System.out.println("servers=="+config.getServers());
        System.out.println("username=="+connectionService.getConnection().getUsername());
        System.out.println("remoteAddress=="+connectionService.getConnection().getRemoteAddress());
        return "Hello World!";
    }
}
