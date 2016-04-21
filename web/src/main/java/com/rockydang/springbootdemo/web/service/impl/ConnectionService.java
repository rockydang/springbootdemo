package com.rockydang.springbootdemo.web.service.impl;

import com.rockydang.springbootdemo.web.conf.ConnectionSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by yanxiao on 16/4/21.
 */
@Service
public class ConnectionService {

    @Autowired
    private ConnectionSettings connection;

    public ConnectionSettings getConnection(){
        return connection;
    }

    @PostConstruct
    public void openConnection() {

        System.out.println("remoteAddress=="+connection.getRemoteAddress());
        System.out.println("userName==" + connection.getUsername());
    }

}
