package com.spring.rubrica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rubrica.dto.ContattoDto;
import com.spring.rubrica.dto.ProprietarioAnnoDTO;
import com.spring.rubrica.dto.RubricaDto;
import com.spring.rubrica.entity.Rubrica;
import com.spring.rubrica.service.RubricaService;

@RestController
@RequestMapping(path="/rubrica")
public class RubricaController {
	@Autowired
	private RubricaService service;
	
	@PostMapping(consumes = "application/json")
	public boolean crea(@RequestBody RubricaDto dto) {
		return service.creaRubrica(dto);
	}
	
	@GetMapping(path="/{idRubrica}/info" , produces= "application/json")
	public RubricaDto cerca(@PathVariable Integer idRubrica) {
		return service.cerca(idRubrica);
	}
	
	@GetMapping(path = "/tutti", produces = "application/json")
	public List<RubricaDto> tutteRubriche(){
		return service.tutteRubriche();
	}
	
	@DeleteMapping(path = "/{idRubrica}/elimina")
	public boolean eliminaRubrica (@PathVariable Integer idRubrica) {
		return service.eliminaRubrica(idRubrica);
	}
	
	@GetMapping(path = "/{idRubrica}")
	public ProprietarioAnnoDTO mostraRubrica (@PathVariable Integer idRubrica) {
		return service.soloPropAnno(idRubrica);
	}
	
	@PatchMapping(path = "/{idRubrica}/modNome")
	public RubricaDto modificaNome (@PathVariable Integer idRubrica, String nuovoNome) {
		return service.modificaNome(idRubrica, nuovoNome);
	}
	
	
	// funzionalità CONTATTI
	@PostMapping(path="/{idRubrica}/contatti" , consumes ="application/json")
	public boolean aggiungiContatto(@PathVariable Integer idRubrica,@RequestBody ContattoDto dto) {
		return service.aggiungiContatto(idRubrica, dto);
	}
}