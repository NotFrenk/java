package com.example.studenti.controller;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.studenti.dto.StudenteDTO;
import com.example.studenti.entity.Studente;
import com.example.studenti.service.StudenteService;

@RestController
@RequestMapping(path = "/studenti")
public class ControllerStudente {
	
	@Autowired
	private StudenteService service;
	
	@PostMapping(consumes = "application/json")
	public boolean aggiungiStudente(@RequestBody StudenteDTO dto) {
		return service.immatricola(dto);
	}
	
	@GetMapping(path = "/{matricola}", produces = "application/json")
	public StudenteDTO cerca(Integer matricola) {
		return service.cerca(matricola);
	}
	
	@GetMapping(path = "/giovani", produces = "application/json")
	public List<StudenteDTO> getGiovani(@RequestParam int annoImm){
		return service.getGiovani(annoImm);
	}
	
	@DeleteMapping(path = "/elimina/{matricola}")
	public boolean eliminaStudente(@PathVariable Integer matricola) {
		return service.elimina(matricola);
	}
	
	@DeleteMapping(path = "/eliminaTutti")
	public boolean eliminaTutti() {
		return service.eliminatutti();
	}

}
