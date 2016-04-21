package com.rockydang.springbootdemo.web.domain;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by yanxiao on 16/4/21.
 *
 * when SpringApplication is start,the class execute...
 */
//@Component
public class ApplicationRunnerBean implements ApplicationRunner {

    public void run(ApplicationArguments args) {
        // Do something...
        System.out.println("ApplicationRunnerBean start..."+args.getSourceArgs()[1]);
    }
}