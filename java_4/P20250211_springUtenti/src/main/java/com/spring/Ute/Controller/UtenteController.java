package com.spring.Ute.Controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	private UtenteService service = new UtenteService();
	
	@GetMapping(path = "/registra", consumes = "application/json")
	public boolean registra(@RequestBody UtenteDTO dto) {
		//Fake
		//System.out.println("ho registrato lutente: "+ utente);//
		//return true;
		
		return service.registra(dto);
	}
	
	
	@GetMapping(path = "/cerca/{id}", produces = "application/json")
	public UtenteDTO cercaPerId(@PathVariable int id) {
		//Fake
		//return new Utente(id, "mario", "rossi", "mario", "red");
		
		return service.cercaPerId(id);
		
	}
	
	@GetMapping(path = "/mostraTutti", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UtenteDTO> mostraTutti(){
		
		return service.listaUtenti();
	}
	
	@GetMapping(path = "/nomeCognome/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public NomeCognomeDTO getNomeCognome(@PathVariable int id) {
		return service.getNomeCognome(id);
	}
	
	@GetMapping(path = "/cambiaPassword/{id}")
	public boolean cambiaPassword(@PathVariable int id, String password) {
		return service.cambiaPassword(id, password);
	}
	
	@GetMapping(path = "/eliminaUtente/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UtenteDTO eliminaUtente(@PathVariable int id) {
		return service.eliminaUtente(id);
		
	}
	
}
