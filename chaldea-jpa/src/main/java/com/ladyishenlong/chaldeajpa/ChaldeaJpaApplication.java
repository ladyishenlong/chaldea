package com.ladyishenlong.chaldeajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ChaldeaJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChaldeaJpaApplication.class, args);
	}

}

