package com.ladyishenlong.chaldeatest.controller;

import com.ladyishenlong.chaldeatest.model.HelloModel;
import com.ladyishenlong.chaldeatest.utils.ResponseUtils;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chaldea-test")
public class HelloController {

    @GetMapping("/hello")
    public ResponseUtils<HelloModel> hello() {
        return ResponseUtils.success(new HelloModel("开膛手杰克", "解体圣母"));
    }
}
