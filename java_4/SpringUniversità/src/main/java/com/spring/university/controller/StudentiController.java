package com.spring.university.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.spring.university.dto.StudenteDTO;
import com.spring.university.service.StudenteService;

@RestController
@RequestMapping(path="/studenti")
public class StudentiController {


	@Autowired
	private StudenteService service;

	@GetMapping(path="/aggiungi", consumes = "application/json")
	public boolean aggiungi(@RequestBody StudenteDTO dto) {
	return service.aggiungi(dto);
	}

	@GetMapping(path="/cerca/{matricola}", produces = "application/json")
	public StudenteDTO cercaPerMatricola(@PathVariable int matricola) {
	return service.cercaPerMatricola(matricola);
	}


	@GetMapping(path="/mostraTutti", consumes = "application/json")
	public List<StudenteDTO> visualizzaTutti(){
	return service.mostraTutti();
	}

	@DeleteMapping(path="/elimina/{matricola}")
	public boolean cancellaStudentePerMatricola(@PathVariable int matricola) {
	return service.deleteByMatricola(matricola);
	}

	@GetMapping(path="/change/{matricola}")
	public StudenteDTO cambiaIndirizzo(@PathVariable int matricola, String indirizzo) {
	return service.changeAdress(matricola, indirizzo);
	}
	}
	

