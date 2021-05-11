package com.loizenai.jwtauthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.mypackage.controller"})
public class SpringBootJwtAuthenticationExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJwtAuthenticationExamplesApplication.class, args);
	}

}
