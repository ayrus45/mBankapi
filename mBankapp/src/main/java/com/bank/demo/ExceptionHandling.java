package com.bank.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.validation.constraints.AssertFalse.List;

@ControllerAdvice
public class ExceptionHandling {

	@ExceptionHandler(MethodArgumentNotValidException.class )
	ResponseEntity<Object> handleEx(MethodArgumentNotValidException ex){
		
		 java.util.List<ObjectError> fieldError= ex.getAllErrors();
		
		return new ResponseEntity<Object>(fieldError.get(0).getDefaultMessage(), HttpStatus.BAD_REQUEST);
	}
	
	
}
