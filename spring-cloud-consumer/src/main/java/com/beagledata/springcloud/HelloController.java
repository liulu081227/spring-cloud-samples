package com.beagledata.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liulu on 2017/10/10.
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("hello/{name}")
    public String hello(@PathVariable String name) {
        return helloService.hello(name);
    }
}
