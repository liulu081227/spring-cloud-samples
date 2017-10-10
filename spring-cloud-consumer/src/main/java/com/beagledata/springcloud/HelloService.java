package com.beagledata.springcloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by liulu on 2017/10/10.
 */
@FeignClient("producer")
public interface HelloService {
    @GetMapping("hello")
    String hello(@RequestParam("name") String name);
}
