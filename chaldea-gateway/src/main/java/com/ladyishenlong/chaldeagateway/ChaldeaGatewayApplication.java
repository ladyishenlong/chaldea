package com.ladyishenlong.chaldeagateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ChaldeaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChaldeaGatewayApplication.class, args);
    }

}

/**
 * @Component    最普通的组件，可以被注入到spring容器进行管理
 * @Repository    作用于持久层
 * @Service    作用于业务逻辑层
 * @controller    作用于表现层（spring-mvc的注解）
 * */