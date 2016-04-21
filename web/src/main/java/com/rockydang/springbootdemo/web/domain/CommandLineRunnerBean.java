package com.rockydang.springbootdemo.web.domain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by yanxiao on 16/4/21.
 *
 * when SpringApplication is start,the class execute...
 */
//@Component
public class CommandLineRunnerBean implements CommandLineRunner {

    public void run(String... args) {
        // Do something...
        System.out.println("CommandLineRunnerBean..."+args[0]);
    }
}