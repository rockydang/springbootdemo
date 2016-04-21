package com.rockydang.springbootdemo.web.domain;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

/**
 * Created by yanxiao on 16/4/21.
 * <p>
 * when SpringApplication is start,the class execute...
 */
@Component
public class ExitCodeGeneratorBean implements ExitCodeGenerator {

    @Override
    public int getExitCode() {

        System.out.println("getExitCode...");
        return 0;
    }
}