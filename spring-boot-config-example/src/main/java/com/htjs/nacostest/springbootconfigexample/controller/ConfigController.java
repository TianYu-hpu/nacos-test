package com.htjs.nacostest.springbootconfigexample.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("config")
public class ConfigController {

    @NacosValue(value = "${config:12345678}", autoRefreshed = true)
    private String config;

    @GetMapping(value = "/get")
    @ResponseBody
    public String get() {
        return config;
    }
}