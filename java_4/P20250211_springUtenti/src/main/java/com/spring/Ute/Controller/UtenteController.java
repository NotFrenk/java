package com.spring.Ute.Contro<z>ller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Ute.dto.NomeCognomeDTO;
import com.spring.Ute.dto.UtenteDTO;
import com.spring.Ute.entity.Utente;
import com.spring.Ute.service.UtenteService;

@RestController
@RequestMapping(path = "/utenti")
public class UtenteController {
	
	@Autowired
	private UtenteService service;
	
	@GetMapping(path = "/registra", consumes = "application/json")
	public boolean registra(@RequestBody UtenteDTO dto) {
		//Fake
		//System.out.println("ho registrato lutente: "+ utente);//
		//return true;
		
		return service.registra(dto);
	}
	
	
	@GetMapping(path = "/{id}", produces = "application/json")
	public UtenteDTO cercaPerId(@PathVariable int id) {
		//Fake
		//return new Utente(id, "mario", "rossi", "mario", "red");
		
		return service.cercaPerId(id);
		
	}
	
	@GetMapping(path = "/mostraTutti", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UtenteDTO> mostraTutti(){
		
		return service.listaUtenti();
	}
	
	@GetMapping(path = "/{id}/nomeCognome", produces = MediaType.APPLICATION_JSON_VALUE)
	public NomeCognomeDTO getNomeCognome(@PathVariable int id) {
		return service.getNomeCognome(id);
	}
	
	@PatchMapping(path = "/{idutente}", produces = "application/json")
	public boolean cambiaPassword(@PathVariable int id, String password) {
		return service.cambiaPassword(id, password);
	}
	
	@DeleteMapping(path = "/{idutente}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UtenteDTO eliminaUtente(@PathVariable int id) {
		return service.eliminaUtente(id);
		
	}
	
}
