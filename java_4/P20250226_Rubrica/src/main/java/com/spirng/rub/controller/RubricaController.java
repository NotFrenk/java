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

import com.spirng.rub.dto.NomeNumeroDTO;
import com.spirng.rub.dto.ProprietarioAnnoDTO;
import com.spirng.rub.dto.RubricaDTO;
import com.spirng.rub.service.RubricaService;

@RestController
@RequestMapping("Rubrica")
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
	
//	Cancella una rubrica esistente
	@DeleteMapping(path = "/{id}/cancella")
	public boolean cancellaRubrica(@PathVariable int id) {
		return service.cancellaRubrica(id);
	}
	
	//Visualizza solo proprietario e anno creazione di una rubrica (passando l’id)
	@GetMapping(path = "/{id}/nome-anno-rubrica", produces = "application/json")
	public ProprietarioAnnoDTO visualizzaAnnoProprietario(@PathVariable int id) {
		return service.visualizzaProprietarioAnno(id);
	}
	
	//Modifica il nome proprietario di una rubrica esistente (torna la rubrica aggiornata)
	@PutMapping(path ="/{id}/modifica-nome", produces = "application/json" )
	public RubricaDTO modificaNomeRubrica(@PathVariable int id, @RequestBody String nuovoNome) {
		return service.modificaProprietario(id, nuovoNome);
	}
	
//	Modifica anno di creazione di una rubrica esistente (torna la rubrica aggiornata)
	@PutMapping(path = "/{id}/modifica-anno", produces = "application/json")
	public RubricaDTO modificaAnnoCreazioneRubrica(@PathVariable int id, @RequestBody int nuovoAnno) {
		return service.modificaAnnoCreazione(id, nuovoAnno);
	}
	
//	Visualizza i nomi di tutti i proprietari delle rubriche e il loro numero totale
	@GetMapping(path = "/proprietari", produces = "application/json")
	public NomeNumeroDTO visualizzaProprietariENumero() {
		return service.visualizzaProprietariENumeroRubriche();
	}
}
