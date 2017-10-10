package com.beagledata.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liulu on 2017/10/10.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

    @GetMapping("hello")
    public String hello(@RequestParam String name) {
        return "Hello " + name + "!";
    }
}
