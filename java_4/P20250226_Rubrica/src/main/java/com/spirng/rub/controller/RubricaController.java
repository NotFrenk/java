package com.spirng.rub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.spirng.rub.dto.RubricaDTO;
import com.spirng.rub.service.RubricaService;

@RestController
@RequestMapping("")
public class RubricaController {
	
	@Autowired
	private RubricaService service;
	
	//inserimento nuova rubrica
	@PostMapping(path = "/aggiungi" , consumes = "application/json")
	public boolean aggiungiRubrica(@RequestBody RubricaDTO dto) {
		return service.aggiungiRubrica(dto);
	}
	
	// cerca rubrica per id
	@GetMapping(path = "/{id}/rubrica", produces = "application/json")
	public RubricaDTO cercaPerId(@PathVariable int id) {
		return service.trovaRubricaPerId(id);
	}
	
	//visualizza tutte le rubriche
	@GetMapping(path = "/rubriche", produces = "application/json")
	public List<RubricaDTO> visualizzarubriche (){
		return service.tutteRubriche();
	}
	
	
	
}
