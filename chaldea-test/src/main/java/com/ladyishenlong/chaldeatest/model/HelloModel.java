package com.ladyishenlong.chaldeatest.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class HelloModel implements Serializable {

    private String name;
    private String treasure;

    public HelloModel(String name, String treasure) {
        this.name = name;
        this.treasure = treasure;
    }
}
