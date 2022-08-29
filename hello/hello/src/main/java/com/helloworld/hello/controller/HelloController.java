package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//definido ponto de acesso para o controller
@RestController
@RequestMapping("/hello")
public class HelloController {
		
	@GetMapping
	public String hello() {
		return "Hello Generation!!";
	}
}
