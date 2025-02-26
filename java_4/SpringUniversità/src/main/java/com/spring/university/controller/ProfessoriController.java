package com.spring.university.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.university.dto.ProfessoreDTO;
import com.spring.university.service.ProfessoreService;


@RestController
@RequestMapping(path="/professori")
public class ProfessoriController {




		
		@Autowired
		private ProfessoreService service;	
		
		@GetMapping(path="/aggiungi", consumes = "application/json")
		public boolean aggiungiProf(@RequestBody ProfessoreDTO dto) {
			return service.aggiungi(dto);
		}
		
		@GetMapping(path="/cerca/{id}", produces= "application/json")
		public ProfessoreDTO cercaPerId(@PathVariable int id) {
			return service.cercaPerID(id);
		}
		
		
		@GetMapping(path="/mostraTutti", consumes="application/json")
		public List<ProfessoreDTO> mostraTutti(){
			return service.mostraTutti();
		}
		
		@DeleteMapping(path="elimina/{id}")
		public boolean cancellaProfessore(@PathVariable int id) {
			return service.deleteById(id);
		}
		
		@GetMapping(path="/change/{id}")
		public ProfessoreDTO cambiaMateria(@PathVariable int id, String materia) {
			return service.changeMateria(id, materia);
		}
		
		
	}

