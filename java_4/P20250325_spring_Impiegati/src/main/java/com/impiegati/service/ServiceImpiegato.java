package com.impiegati.service;

import java.util.List;

import com.impiegati.dto.NomeCognomeDTO;
import com.impiegati.dto.ImpiegatoDTO;



public interface ServiceImpiegato {
	
	public boolean assunzione(ImpiegatoDTO dto);
	public ImpiegatoDTO trovaImpiegato (Integer matricola);
	public List<ImpiegatoDTO> getImpiegati ();
	public ImpiegatoDTO eliminaImpiegato (Integer matricola);
	public ImpiegatoDTO modificaSalario (Integer matricola, int nuovoSalario);
	// avanzate
	public NomeCognomeDTO elimina2 (Integer matricola);
	public List<NomeCognomeDTO> getImiegatiNomCogn();
	

}
