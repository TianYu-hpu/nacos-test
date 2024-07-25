package com.htjs.nacostest.springcloudconfigexample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("config")
@RefreshScope
public class ConfigController {

    @Value(value = "${config}")
    private String config;

    @GetMapping(value = "/get")
    @ResponseBody
    public String get() {
        return config;
    }
}