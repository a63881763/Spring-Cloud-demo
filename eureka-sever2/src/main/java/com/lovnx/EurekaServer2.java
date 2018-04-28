package com.lovnx;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer2 {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServer2.class).web(true).run(args);
	}

}
