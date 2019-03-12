package com.ws.eurekaservernode2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerNode2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerNode2Application.class, args);
	}

}
