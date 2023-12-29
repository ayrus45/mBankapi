package com.bank.demo;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Valid
public class User {
	
	@Length (max = 5, message = "maximum lenth is 5")
	private String userName;
	@Min(value = 1 , message = "minimum is 1")
	private String password;
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
