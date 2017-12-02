package com.techjava.springbootehcacheexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootEhcacheExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEhcacheExampleApplication.class, args);
	}
}
