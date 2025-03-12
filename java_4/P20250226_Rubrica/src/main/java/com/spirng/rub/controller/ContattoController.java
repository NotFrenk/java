package com.spirng.rub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spirng.rub.dto.ContattoDTO;
import com.spirng.rub.service.ContattiService;
import com.spirng.rub.service.RubricaService;

@RestController
@RequestMapping("")
public class ContattoController {
	
	@Autowired
	private ContattiService service;
	
//	Inserisci nuovo contatto
	@PostMapping(path = "/{id}/aggiungi-contatto", consumes = "application/json")
	public boolean aggiungiContatto(@PathVariable int id, @RequestBody ContattoDTO dto) {
		return service.aggiungiContatto(id, dto);
	}
	
//	Visualizza un contatto per id
	@GetMapping(path = "/{idRubrica}/contatto/{idContatto}", produces = "application/json")
	public ContattoDTO visualizzaContattoPerId(@PathVariable int idRubrica, @PathVariable int idContatto) {
		return service.visualizzaContattoPerId(idRubrica, idContatto);
	}
	
//	Modifica un contatto esistente (tutti i campi tranne la chiave primaria)
	@PutMapping(path = "/{idRubrica}/modifica-contatto/{idContatto}", consumes = "application/json")
	public ContattoDTO modificaContatto(@PathVariable int idRubrica, @PathVariable int idContatto, @RequestBody ContattoDTO dto) {
		return service.modificaContatto(idRubrica, idContatto, dto);
	}
	
//	Cancella un contatto esistente
	@DeleteMapping(path = "/{idRubrica}/cancella-contatto/{idContatto}")
	public boolean cancellaContatto(@PathVariable int idRubrica, @PathVariable int idContatto) {
	    return service.cancellaContatto(idRubrica, idContatto);
	}
	
	
//	Visualizza tutti i contatti registrati
	@GetMapping(path = "/{id}/contatti", produces = "application/json")
	public List<ContattoDTO> visualizzaContatti(@PathVariable int id) {
	    return service.visualizzaContatti(id);
	}
	
//	Visualizza il numero di contatti registrati
	@GetMapping(path = "/{id}/numero-contatti", produces = "application/json")
	public int visualizzaNumeroContatti(@PathVariable int id) {
	    return service.visualizzaNumeroContatti(id);
	}
	
//	Visualizza il contatto con un dato numero
	@GetMapping(path = "/{id}/contatto-per-numero/{numero}", produces = "application/json")
	public ContattoDTO visualizzaContattoPerNumero(@PathVariable int id, @PathVariable int numero) {
	    return service.visualizzaContattoPerNumero(id, numero);
	}
	
//	Ricerca il nome e il cognome dei contatti di un dato gruppo
	@GetMapping(path = "/{id}/contatti-per-gruppo/{gruppo}", produces = "application/json")
	public List<String> ricercaContattiPerGruppo(@PathVariable int id, @PathVariable String gruppo) {
	    return service.ricercaContattiPerGruppo(id, gruppo);
	}
	
//	Ricerca il numero di contatti di un dato gruppo
	@GetMapping(path = "/{id}/numero-contatti-per-gruppo/{gruppo}", produces = "application/json")
	public int ricercaNumeroContattiPerGruppo(@PathVariable int id, @PathVariable String gruppo) {
	    return service.ricercaNumeroContattiPerGruppo(id, gruppo);
	}
	
//	Cancella un gruppo di una rubrica (cioè tutti i contatti appartenenti ad un dato gruppo)
	@DeleteMapping(path = "/{id}/cancella-gruppo/{gruppo}")
	public boolean cancellaGruppo(@PathVariable int id, @PathVariable String gruppo) {
	    return service.cancellaGruppo(id, gruppo);
	}
	
//	Modifica un contatto da NON preferito a preferito
	@PutMapping(path = "/{idRubrica}/modifica-preferito/{idContatto}")
	public ContattoDTO modificaPreferito(@PathVariable int idRubrica, @PathVariable int idContatto) {
	    return service.modificaPreferito(idRubrica, idContatto);
	}
	
//	Ricerca tutti i preferiti
	@GetMapping(path = "/{id}/preferiti", produces = "application/json")
	public List<ContattoDTO> ricercaPreferiti(@PathVariable int id) {
	    return service.ricercaPreferiti(id);
	}
}
