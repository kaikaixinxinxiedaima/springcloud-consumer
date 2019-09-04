package com.example.demo.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name)
    {
        return restTemplate.getForObject("http://spring-cloud-eureka-pro/hi?name=" + name, String.class);
    }
}
