package com.ladyishenlong.chaldeagateway.controller;

import com.ladyishenlong.chaldeagateway.model.HelloModel;
import com.ladyishenlong.chaldeagateway.service.TestService;
import com.ladyishenlong.chaldeagateway.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Autowired
    TestService testService;

    @GetMapping("/hello")
    public ResponseUtils<HelloModel> hello() {
         return testService.hello();
    }


}
