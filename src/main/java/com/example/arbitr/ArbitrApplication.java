package com.example.arbitr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class ArbitrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArbitrApplication.class, args);
	}

}
