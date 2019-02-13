package com.ladyishenlong.chaldeagateway.controller;

import com.ladyishenlong.chaldeagateway.model.HelloModel;
import com.ladyishenlong.chaldeagateway.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Autowired
    TestService testService;

    @GetMapping("/hello")
    public HelloModel hello() {
        return testService.hello();
    }


}
