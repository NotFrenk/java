package com.spirng.rub.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spirng.rub.dao.DAORubricaMappaImpl;
import com.spirng.rub.dto.ContattoDTO;
import com.spirng.rub.entity.entityContattoTelefonico;
import com.spirng.rub.entity.entityRubrica;
import com.spirng.rub.utility.Conversioni;

public class ContattiServiceImp implements ContattiService{
	@Autowired
	public DAORubricaMappaImpl dao;
	
	
//	Inserisci nuovo contatto
	public boolean aggiungiContatto(int idRubrica, ContattoDTO dto) {
		entityRubrica rubrica = dao.selectById(idRubrica);
		if (rubrica != null) {
			entityContattoTelefonico contatto = Conversioni.daContattoDTOAContatto(dto);
			rubrica.getContatti().add(contatto);
			return true;
		}
		return false;
	}
	
//	Visualizza un contatto per id
	
//	Modifica un contatto esistente (tutti i campi tranne la chiave primaria)
//	Cancella un contatto esistente
//	Visualizza tutti i contatti registrati
//	Visualizza il numero di contatti registrati
//	Visualizza il contatto con un dato numero
//	Ricerca il nome e il cognome dei contatti di un dato gruppo
//	Ricerca il numero di contatti di un dato gruppo
//	Cancella un gruppo di una rubrica (cioè tutti i contatti appartenenti ad un dato gruppo)
//	Modifica un contatto da NON preferito a preferito
//	Ricerca tutti i preferiti

}
