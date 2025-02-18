package com.spring.report.utility;

import java.util.ArrayList;
import java.util.List;

import com.spring.report.dto.ProdottoNoIdDTO;
import com.spring.report.dto.prodottoDTO;
import com.spring.report.entity.prodotto;



public class conversioni {
	
	public static prodotto daProdottoDTOProdotto(prodottoDTO dto) {
		return new prodotto(dto.getId(), dto.getQuantia(), dto.getMarca(), dto.getModello(), dto.getDescrizione(), dto.getCategoria(), dto.getPrezzo_max(), dto.getPrezzo_cons());
	}
	
	public static prodottoDTO daProdottoAProdottoDTO(prodotto entity) {
		return new prodottoDTO(entity.getId(), entity.getQuantia(), entity.getMarca(), entity.getModello(), entity.getDescrizione(), entity.getCategoria(), entity.getPrezzo_max(), entity.getPrezzo_cons());
	}
	
	public static ProdottoNoIdDTO daProdottoAProdottoNoIdDTO(prodotto entity) {
		return new ProdottoNoIdDTO(entity.getQuantia(), entity.getMarca(), entity.getModello(), entity.getDescrizione(), entity.getCategoria(), entity.getPrezzo_max(), entity.getPrezzo_cons());
	}
	
	public static List<ProdottoNoIdDTO> lista(List<prodotto> lista_prod){
		ArrayList<ProdottoNoIdDTO> lista_dto = new ArrayList<ProdottoNoIdDTO>();
		for (prodotto prod : lista_prod) {
			lista_dto.add(conversioni.daProdottoAProdottoNoIdDTO(prod));
		}
		return lista_dto;
	}
	
}
