package com.alvesjefs.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class OpenflyConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenflyConfigurationApplication.class, args);
	}

}
