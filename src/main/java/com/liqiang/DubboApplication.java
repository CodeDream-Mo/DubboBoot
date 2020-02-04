package com.liqiang;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@DubboComponentScan(basePackages = {"com.liqiang", "com.enjoy"})
public class DubboApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DubboApplication.class, args);
    }

}
