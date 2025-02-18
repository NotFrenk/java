package com.spring.primoProj.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/data")
public class dataController {
	
	@GetMapping(path = "/info")
	public LocalDate Datacorrente() {
		return LocalDate.now();
	}
}
