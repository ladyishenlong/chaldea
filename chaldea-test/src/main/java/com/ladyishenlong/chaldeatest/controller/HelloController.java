package com.ladyishenlong.chaldeatest.controller;

import com.ladyishenlong.chaldeatest.model.HelloModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chaldea-test")
public class HelloController {

    @GetMapping("/hello")
    public HelloModel hello(){
        return new HelloModel("开膛手杰克","解体圣母");
    }
}
