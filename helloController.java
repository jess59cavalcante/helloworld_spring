package org.generation.hello.controller;



	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	
	@RestController
	
	@RequestMapping("/helloworld") //Informar o endereço da Web
	public class helloController {
		@GetMapping // pega informação do método e exibe
	    public String hello() {
		
	
	        return "Hello World! Seja, bem vindos ao Spring!";
	}
	}


