package com.bank.user.demo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	

}


