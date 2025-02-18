package com.spring.primoProj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // indica a spring che dovrà istanziare e gestire questa classe
@RequestMapping(path = "/calcola")
public class CalcolatriceController {
	
	@GetMapping(path = "/sum")
	public int somma(int n1,int n2) {
		return n1 + n2;
	}
	
	@GetMapping(path = "/molti")
	public int moltiplicazione(int n1, int n2) {
		return n1 * n2;
	}
	
	@GetMapping(path = "/sot")
	public int sottrazione(int n1,int n2) {
		return n1 - n2;
	}
	
	@GetMapping(path = "/div")
	public int divisione(int n1,int n2) {
		return n1 / n2;
	}
}
