package com.spring.Ute.service;

import java.util.List;

import com.spring.Ute.dto.NomeCognomeDTO;
import com.spring.Ute.dto.UtenteDTO;

public interface UtenteService {
	
	public boolean registra(UtenteDTO dto);
	public UtenteDTO cercaPerId(int id);
	public NomeCognomeDTO getNomeCognome(int id);
	public List<UtenteDTO> listaUtenti();
	public boolean cambiaPassword(int id, String password);
	public UtenteDTO eliminaUtente(int id);
}
