package com.htjs.nacostest.springbootconfigexample;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "nacos-config-example", autoRefreshed = true)
public class SpringBootConfigExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigExampleApplication.class, args);
    }

}
