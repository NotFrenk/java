package com.spring.report.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.report.dto.ProdottoNoIdDTO;
import com.spring.report.dto.ReportDTO;
import com.spring.report.dto.prodottoDTO;
import com.spring.report.service.prodottoService;

@RestController
@RequestMapping(path = "/prodotti")

public class prodottoController {
	
	private prodottoService service = new prodottoService();
	
	@GetMapping(path = "/inserisciProdotto", consumes = "application/json")
	public boolean insProd (@RequestBody prodottoDTO dto) {
		return service.caricaProdotto(dto);
	}
	
	@GetMapping(path = "/mostraProdotti", consumes = "application/json")
	public List<ProdottoNoIdDTO> mostraProdotti(){
		return service.listaProdotti();
	}
	
	@GetMapping(path = "/mostraProdotto/{id}", consumes = "application/json")
	public prodottoDTO mostraProdottoPerId (@PathVariable int id) {
		return service.cercaPerId(id);
	}
	
	@GetMapping(path = "/reportProdotti", consumes = "application/json")
	public ReportDTO reportProdotti() {
		return service.getReport();
	}

}
