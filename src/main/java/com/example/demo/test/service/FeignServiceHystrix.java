package com.example.demo.test.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class FeignServiceHystrix implements FeignService{
    @Override
    public String hiService(@RequestParam(value = "name")String name) {
        return "hi" +name+", this is fallback messge";
    }
}
