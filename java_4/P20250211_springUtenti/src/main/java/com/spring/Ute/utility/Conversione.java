package com.spring.Ute.utility;

import java.util.ArrayList;
import java.util.List;

import com.spring.Ute.dto.UtenteDTO;
import com.spring.Ute.entity.Utente;

public class Conversione {
	
	public static Utente daUtenteDTOAUtente(UtenteDTO dto) {
		return new Utente(dto.getId(), dto.getNome(), dto.getCognome(), dto.getUsername(), dto.getPassword());
	}
	
	public static UtenteDTO daUtenteAUtenteDTO(Utente entity) {
		return new UtenteDTO(entity.getId(), entity.getNome(), entity.getCognome(), entity.getUsername(), entity.getPassword());
	}
	
	public static List<UtenteDTO> lista(List<Utente> lista_utenti){
		ArrayList<UtenteDTO> lista_dto = new ArrayList<UtenteDTO>();
		for (Utente utente : lista_utenti) {
			lista_dto.add(Conversione.daUtenteAUtenteDTO(utente));
		}
		return lista_dto;
		
	}
}
