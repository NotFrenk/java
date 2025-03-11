package com.spirng.rub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spirng.rub.service.ContattiService;
import com.spirng.rub.service.RubricaService;

@RestController
@RequestMapping("Contatti")
public class ContattoController {
	
	@Autowired
	private ContattiService service;
	
	

	
}
