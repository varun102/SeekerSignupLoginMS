package com.ntl.topjobs.seekersignuplogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//import com.ntl.topjobs.jobseekermicroservice.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.ntl.topjobs.seekersignuplogin")
@EnableDiscoveryClient
public class SeekerSignupLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeekerSignupLoginApplication.class, args);
		System.out.println("Start Seeker LoginSignup");
	}
	
}
