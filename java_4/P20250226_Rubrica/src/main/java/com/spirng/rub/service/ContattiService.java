package com.spirng.rub.service;

import java.util.List;

import com.spirng.rub.dto.ContattoDTO;

public interface ContattiService {
	
	public boolean aggiungiContatto(int idRubrica, ContattoDTO dto);
	public ContattoDTO visualizzaContattoPerId (int idRubrica, int idContatto);
	public ContattoDTO modificaContatto(int idRubrica, int idContatto, ContattoDTO dto);
	public boolean cancellaContatto(int idRubrica, int idContatto);
	public List<ContattoDTO> visualizzaContatti(int idRubrica);
	public int visualizzaNumeroContatti(int idRubrica);
	public ContattoDTO visualizzaContattoPerNumero(int idRubrica, int numero);
	public List<String> ricercaContattiPerGruppo(int idRubrica, String gruppo);
	public int ricercaNumeroContattiPerGruppo(int idRubrica, String gruppo);
	public boolean cancellaGruppo(int idRubrica, String gruppo);
	public ContattoDTO modificaPreferito(int idRubrica, int idContatto);
	public List<ContattoDTO> ricercaPreferiti(int idRubrica);
	
}
