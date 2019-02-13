package com.ladyishenlong.chaldeagateway.controller;

import com.ladyishenlong.chaldeagateway.model.ServantModel;
import com.ladyishenlong.chaldeagateway.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JpaController {


    @Autowired
    JpaService jpaService;


    @GetMapping("/getAllServant")
    public List<ServantModel> getAllServant(){
        return jpaService.getAllServant();
    }


}
