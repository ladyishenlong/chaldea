package com.ladyishenlong.chaldeagateway.service;

import com.ladyishenlong.chaldeagateway.model.HelloModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name = "chaldea-test")
public interface TestService {

    @GetMapping("/chaldea-test/hello")
    HelloModel hello();
}
