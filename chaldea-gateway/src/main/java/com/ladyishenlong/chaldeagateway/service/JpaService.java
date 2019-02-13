package com.ladyishenlong.chaldeagateway.service;


import com.ladyishenlong.chaldeagateway.model.ServantModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@FeignClient(name = "chaldea-jpa")
public interface JpaService {


    @GetMapping("/chaldea-jpa/getAllServant")
    List<ServantModel> getAllServant();

}
