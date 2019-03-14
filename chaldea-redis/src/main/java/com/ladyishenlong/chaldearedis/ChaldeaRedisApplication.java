package com.ladyishenlong.chaldearedis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 使用redis
 * 测试使用本地redis 在test之中
 * 以key-value形式储存数据
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ChaldeaRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChaldeaRedisApplication.class, args);
    }

}
