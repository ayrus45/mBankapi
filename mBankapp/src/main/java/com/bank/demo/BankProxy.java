package com.bank.demo;

import java.util.ArrayList;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="BANK-USER-APP")
public interface BankProxy {
	
	@GetMapping("/users")
	public ResponseEntity<ArrayList<User>> getUserList();

}
