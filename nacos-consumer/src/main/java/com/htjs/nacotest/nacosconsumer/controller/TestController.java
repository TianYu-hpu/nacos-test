package com.htjs.nacotest.nacosconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/echo/{str}")
    public String echo(@PathVariable String str) {
        return restTemplate.getForObject("http://spring-cloud-config-example/echo/" + str, String.class);
    }
}
