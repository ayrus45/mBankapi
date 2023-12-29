package com.bank.user.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
@Service
public interface UserService {

	
	ArrayList<User> getUserList();
}
