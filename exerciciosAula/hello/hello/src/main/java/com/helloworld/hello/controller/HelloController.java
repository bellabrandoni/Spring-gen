package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//definido ponto de acesso para o controller
@RestController //Indica para o Spring que esse arquivo vai conter uma classe controladora

@RequestMapping("/hello")//Define o nome do endpoint, usando o verbo escolhido
public class HelloController {
		
	@GetMapping
	public String HelloWorld() {
		return "Hello Generation!!";
	}
}
