package com.bank.user.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepo userRepo;

	@Override
	public ArrayList<User> getUserList() {
		// TODO Auto-generated method stub
		ArrayList< User> userlist= new ArrayList<>();
		userlist.add(new User(1, "surya", "111"));
		userlist.add(new User(2, "polepalli", "222"));
		if(!userRepo.existsById(1))
		userRepo.saveAll(userlist);
		return (ArrayList<User>) userRepo.findAll();
	}
	
	
}
