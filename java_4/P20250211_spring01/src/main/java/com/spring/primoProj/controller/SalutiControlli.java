package com.spring.primoProj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/saluto")
@RestController
public class SalutiControlli {
	
	public SalutiControlli(){
		
		System.out.println("spring istanzia SalutiController... ");
	}
	
	@GetMapping(path = "/generic")
	public String salutoGenerico() {
		return "Hello World!";
	}
	
	@GetMapping(path = "/pers")
	public String salutoPersona(String nome) {
		return "Hello " + nome;
	}
}
