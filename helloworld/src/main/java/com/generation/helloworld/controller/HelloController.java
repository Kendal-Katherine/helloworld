package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String Hello() {
		return "<h1><i>Hello Turma 68!!!</i></h1>";
	}
	
	@GetMapping("/top")
	public String top() {
		return "<b>Turma 68 TOP!!!</b>";
	}

}


