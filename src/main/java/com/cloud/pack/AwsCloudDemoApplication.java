package com.cloud.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cloud.pack.controller"})
public class AwsCloudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsCloudDemoApplication.class, args);
	}

}
