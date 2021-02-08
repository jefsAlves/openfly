package com.alvesjefs.msproducts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OpenflyMsProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenflyMsProductsApplication.class, args);
	}

}
