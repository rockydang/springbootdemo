package com.rockydang.springbootdemo.web.conf;

import org.apache.catalina.Server;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.net.InetAddress;

/**
 * Created by yanxiao on 16/4/21.
 */
@Component
@ConfigurationProperties(prefix = "connection")
public class ConnectionSettings {

    private String username;

    private InetAddress remoteAddress;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public InetAddress getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(InetAddress remoteAddress) {
        this.remoteAddress = remoteAddress;
    }
}
