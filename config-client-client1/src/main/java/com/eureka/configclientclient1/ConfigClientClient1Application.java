package com.eureka.configclientclient1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class ConfigClientClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientClient1Application.class, args);
	}

	@Value("${server.port}")
	String port;

	@Value("${hello}")
	String hello;

	@RequestMapping("/")
	public String home() {
		return "hello1 world from port " + port+":"+hello;
	}
}
