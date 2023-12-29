package com.bank.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import jakarta.validation.Valid;

@RestController
public class LoginController {
	@Autowired
BankProxy bankProxy;
	
	@PostMapping("/login")
	public List<User> loginUser(@Valid @RequestBody User user) {
		System.out.println(user);
		RestTemplate restTemplate= new RestTemplate();
		
		
		 ResponseEntity<List<User>> rateResponse= restTemplate.exchange("http://localhost:8090/users",HttpMethod.GET , null, new ParameterizedTypeReference<List<User>>() {
         });
		return rateResponse.getBody();
	}
	
	@GetMapping("/test")
	public void loginUser1( @RequestParam String name) {
		System.out.println("hello-world" +name);
		//return user;
	}
	
	
	@PostMapping("/login-feign")
	public List<User> loginUserFeign(@Valid @RequestBody User user) {
		System.out.println("bankProxy feign");
		return bankProxy.getUserList().getBody();
	}
	
	
	
}
