package com.ladyishenlong.chaldeajpa.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "servant")//注意写上表名，否则是默认的是类名
@Data
public class ServantModel {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private int age;
    private String treasure;


}
