package com.tu.javacop.test.demo;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class UserController {

	
	@GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
	public String hello() {
		return "Hi There";
	}
}
