package com.rockydang.springbootdemo.web.domain;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.admin.SpringApplicationAdminMXBean;
import org.springframework.stereotype.Component;

/**
 * Created by yanxiao on 16/4/21.
 * <p>
 * when SpringApplication is start,the class execute...
 */
//@Component
public class SpringApplicationAdmin implements SpringApplicationAdminMXBean {

    @Override
    public boolean isReady() {
        return false;
    }

    @Override
    public boolean isEmbeddedWebApplication() {
        return false;
    }

    @Override
    public String getProperty(String s) {
        return null;
    }

    @Override
    public void shutdown() {

    }
}