package com.htjs.nacostest.serviceprovider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class EchoController {

    private Logger logger = LoggerFactory.getLogger(EchoController.class);

    @Value(value = "${config}")
    private String config;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        logger.info("Hello Nacos Discovery " + string);
        return "Hello Nacos Discovery " + string;
    }

    @GetMapping(value = "/get")
    @ResponseBody
    public String get() {
        return config;
    }
}
