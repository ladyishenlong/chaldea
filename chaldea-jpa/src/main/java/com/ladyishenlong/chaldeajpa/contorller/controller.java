package com.ladyishenlong.chaldeajpa.contorller;

import com.ladyishenlong.chaldeajpa.jpa.ServantRepository;
import com.ladyishenlong.chaldeajpa.model.ServantModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chaldea-jpa")
public class controller {


    @Autowired
    ServantRepository servantRepository;


    @GetMapping("/getAllServant")
    public List<ServantModel> getAllServant(){
       return servantRepository.findAll();
    }




}
