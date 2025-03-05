package com.spirng.rub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spirng.rub.dto.RubricaDTO;
import com.spirng.rub.entity.entityRubrica;
import com.spirng.rub.service.RubricaService;

@RestController
@RequestMapping("")
public class RubricaController {
	
	@Autowired
	private RubricaService rubricaSrvice;
	
	//inserimento nuova rubrica
	@PostMapping(path = "/aggiungi" , consumes = "application/json")
	public boolean aggiungiRubrca(@RequestBody RubricaDTO dto) {
		return rubricaSrvice.aggiungiRubrica(dto);
	}
	
	// cerca rubrica per id
	@getMapping(path = "/{id}/rubrica")
	public static cercaRubrica{
		
	}
}
