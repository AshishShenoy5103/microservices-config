package com.tourplanner.module4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Module4Application {

	public static void main(String[] args) {
		SpringApplication.run(Module4Application.class, args);
	}

}
