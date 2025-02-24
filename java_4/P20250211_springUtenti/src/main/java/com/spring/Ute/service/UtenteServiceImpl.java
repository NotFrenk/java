package com.spring.Ute.service;


import java.util.List;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Ute.dao.DAOUtente;
import com.spring.Ute.dto.NomeCognomeDTO;
import com.spring.Ute.dto.UtenteDTO;
import com.spring.Ute.entity.Utente;
import com.spring.Ute.utility.Conversione;

@Service
public class UtenteServiceImpl implements UtenteService{

	@Autowired
	private DAOUtente dao;

	public boolean registra(UtenteDTO dto){

		// 1. trasformo il dto in entity
		Utente entity = Conversione.daUtenteDTOAUtente(dto);

		// 2. inserisco l'entity attraverso il dao
		return dao.insert(entity);
	}

	public UtenteDTO cercaPerId(int id) {
		//1. chiamo il dao
		Utente utente = dao.selectById(id);
		
		if(utente!= null) {
			//2. trasformo
			UtenteDTO dto = Conversione.daUtenteAUtenteDTO(utente);
			return dto;
		}
		return null;
	}
	
	public NomeCognomeDTO getNomeCognome(int id) {
		Utente utente = dao.selectById(id);
		if(utente!= null) {
			return new NomeCognomeDTO(utente.getNome(), utente.getCognome());
		}
		return null;
	}
	
	public List<UtenteDTO> listaUtenti(){
		List<Utente> lista_utenti = dao.selectAll();
		return Conversione.lista(lista_utenti);
		
	}
	
	public boolean cambiaPassword(int id, String password) {
		Utente ute = dao.selectById(id);
		if (ute == null){
			return false;
		}
		ute.setPassword(password);
		
		return true;
	}
	
	public UtenteDTO eliminaUtente(int id) {
		UtenteDTO ute = cercaPerId(id);
		
		if (ute == null) {
			return null;
		}
		
		dao.delete(ute.getId());
		return ute;
	}
	
}
