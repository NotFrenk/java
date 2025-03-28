package com.ecommerce.utility;

import java.util.List;
import java.util.stream.Collectors;

import com.ecommerce.dto.ProdottoDTO;
import com.ecommerce.dto.VenditoreDTO;
import com.ecommerce.dto.VenditoreSenzaProdDTO;
import com.ecommerce.entity.ProdottoEntity;
import com.ecommerce.entity.VenditoreEntity;


public class Conversioni {
	
	public static ProdottoEntity FromProdottoDTOToProdottoEntity(ProdottoDTO dto) {
		return new ProdottoEntity(dto.getIdProdotto(), dto.getDescrizione(), dto.getCategoria(), dto.getQuantita(), dto.getSconto(), dto.getPrezzo());
	}
	
	public static ProdottoDTO FromProdottoEntityToProdottoDTO (ProdottoEntity entity) {
		return new ProdottoDTO(entity.getIdProdotto(), entity.getDescrizione(), entity.getCategoria(), entity.getQuantita(), entity.getSconto(), entity.getPrezzo());
	}
	
	public static VenditoreEntity FromVenditoreDTOToVenditoreEntity(VenditoreDTO dto) {
		
		VenditoreEntity venditore = new VenditoreEntity(dto.getidVenditore(), dto.getNome(), dto.getCognome(), dto.getUsername(), dto.getPassword(), dto.getVia(), dto.getCitta());
		
		List<ProdottoDTO> listD = dto.getProdotti();
		List<ProdottoEntity> lista = listD.stream()
				.map(t -> Conversioni.FromProdottoDTOToProdottoEntity(t))
				.collect(Collectors.toList());
		
		venditore.setProdotti(lista);
		return venditore;
	}
	
	public static VenditoreDTO FromVenditoreEntiryToVenditoreDTO(VenditoreEntity entity) {
		
		VenditoreDTO venditoreD = new VenditoreDTO(entity.getidVenditore(), entity.getNome(), entity.getCognome(), entity.getUsername(), entity.getPassword(), entity.getVia(), entity.getCitta());
		
		List<ProdottoEntity> lista = entity.getProdotti();
		List<ProdottoDTO> listaD = lista.stream()
				.map(t -> Conversioni.FromProdottoEntityToProdottoDTO(t))
				.collect(Collectors.toList());
		
		venditoreD.setProdotti(listaD);
		return venditoreD;
	
	}
	
	public static VenditoreSenzaProdDTO FromVenditoreEntiryToVenditoreSenzaProdDTO(VenditoreEntity entity) {
		
		VenditoreSenzaProdDTO venditoreD = new VenditoreSenzaProdDTO(entity.getidVenditore(), entity.getNome(), entity.getCognome(), entity.getUsername(), entity.getPassword(), entity.getVia(), entity.getCitta());
		
		return venditoreD;
	
	}
}
