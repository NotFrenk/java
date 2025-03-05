package com.spirng.rub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spirng.rub.entity.entityRubrica;
import com.spirng.rub.service.RubricaService;

@RestController
@RequestMapping("/rubrica")
public class RubricaController {
	
	@Autowired
	private RubricaService rubricaSrvice;
	
	//inserimento nuova rubrica
	@PostMapping("/aggiungi")
	public boolean aggiungiRubrca(@RequestBody entityRubrica rubrica) {
		return rubrica
	}
}
