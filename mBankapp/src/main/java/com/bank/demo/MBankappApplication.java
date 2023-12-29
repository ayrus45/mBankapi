package com.bank.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class MBankappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MBankappApplication.class, args);
	}

}
