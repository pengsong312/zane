package com.zane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.zane"})
public class ZaneSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZaneSpringApplication.class, args);
	}

}
