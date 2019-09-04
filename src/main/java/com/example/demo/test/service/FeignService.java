package com.example.demo.test.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "spring-cloud-eureka-pro",fallback = FeignServiceHystrix.class)
public interface FeignService {
    @RequestMapping(value = "/hi")
    public String hiService(@RequestParam(value = "name") String name);
}
