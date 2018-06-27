package com.hps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.hps")
public class HpsSdkApplication {

	public static void main(String[] args) {
		SpringApplication.run(HpsSdkApplication.class, args);
	}
}
