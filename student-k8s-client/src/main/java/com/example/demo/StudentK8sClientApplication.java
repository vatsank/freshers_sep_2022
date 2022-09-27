package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentK8sClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(StudentK8sClientApplication.class, args);
	
		  RestTemplate template = ctx.getBean(RestTemplate.class);
				  
				  System.out.println(
						  template.getForObject("http://localhost:8080/api/v1/students", 
								  String.class));
	
	}

	
	@Bean
	public RestTemplate template() {
		
		return new RestTemplate();
	}
}
