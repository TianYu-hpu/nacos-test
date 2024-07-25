package com.htjs.nacostest.springcloudconfigexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpingCloudConfigExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpingCloudConfigExampleApplication.class, args);
    }

}
