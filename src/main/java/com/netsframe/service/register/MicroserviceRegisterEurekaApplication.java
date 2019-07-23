package com.netsframe.service.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceRegisterEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceRegisterEurekaApplication.class, args);
	}
}
