package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dto.VenditoreDTO;
import com.ecommerce.dto.VenditoreSenzaProdDTO;
import com.ecommerce.service.VenditoreService;

@RestController
@RequestMapping(path = "/ecommerce")
public class EcommerceController {
	
	@Autowired
	private VenditoreService service;
	
	@PostMapping (consumes = "application/json")
	public boolean inserisciVenditore(@RequestBody VenditoreDTO dto) {
		return service.inserisciVenditore(dto);
	}
	
	@GetMapping(path = "/{idVenditore}", produces = "application/json")
	public VenditoreDTO vediPerId(@PathVariable Integer idVenditore) {
		return service.visualizzaVenditoreId(idVenditore);
	}
	
	@GetMapping(path = "/noProdotti/{idVenditore}",produces = "application/json")
	public VenditoreSenzaProdDTO senzaProdotto(@PathVariable Integer idVenditore) {
		return service.visualizzaSenzaProdotti(idVenditore);
	}
	@PatchMapping (path = "modPassword/{idVenditore}")
	public VenditoreDTO modificaPassword(@PathVariable Integer idVenditore, @RequestParam String nuovaPassword) {
		return service.modificaPassword(idVenditore, nuovaPassword);
	}
}
