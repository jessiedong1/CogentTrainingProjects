package com.example.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.exception.RecordNotFoundException;


@ControllerAdvice
//@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CustomerAppExceptionController {
	@ExceptionHandler(value = RecordNotFoundException.class)
	public ResponseEntity<Object> exception(RecordNotFoundException ex){
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

}
