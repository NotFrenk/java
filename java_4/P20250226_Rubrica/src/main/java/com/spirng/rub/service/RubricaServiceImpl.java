package com.spirng.rub.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spirng.rub.dao.DAORubricaMappa;
import com.spirng.rub.dao.DAORubricaMappaImpl;
import com.spirng.rub.dto.NomeNumeroDTO;
import com.spirng.rub.entity.entityRubrica;

@Service
public class RubricaServiceImpl implements RubricaService{
	@Autowired
	private DAORubricaMappa DAO;
	
	
	//inserisci rubrica nuova
	public boolean aggiungiRubrica (entityRubrica rubrica) {
		return DAO.insert(rubrica);
	}
	
	//visualizza rubrica per id 
	public entityRubrica trovaRubricaPerId(int id){
		return DAO.selectById(id);
	}
	
	//visualizza tutte le rubriche
	public List<entityRubrica> tutteRubriche(){
		return DAO.selectAll();
	}
	
	//cancella una rubrica
	public boolean eliminaRubrica (int id) {
		return DAO.delete(id);
	}
	
	//Visualizza solo proprietario e anno creazione di una rubrica
	public String proprietarioAnnoCreazione (int id) {
		entityRubrica rubrica = DAO.selectById(id);
		return rubrica != null ? rubrica.getNomeProprietario() + " - " + rubrica.getAnnoCreazione() : "rubrica non trovata";
	}
	
	//odifica il nome proprietario di una rubrica esistente (torna la rubrica aggiornata)
    public entityRubrica modificaNomeProprietario(int id, String nuovoNome) {
        entityRubrica rubrica = DAO.selectById(id);
        if (rubrica != null) {
            rubrica.setNomeProprietario(nuovoNome);
            return rubrica;
        }
        return null;
    }
	
	//Modifica anno di creazione di una rubrica esistente (torna la rubrica aggiornata)
	public entityRubrica modificaAnnoRubrica(int id, int nuovoAnno	) {
		entityRubrica rubrica = DAO.selectById(id);
		if (rubrica != null) {
			rubrica.setAnnoCreazione(nuovoAnno);
			return rubrica;
		}
		return null;
	}
	
	//Visualizza i nomi di tutti i proprietari delle rubriche e il loro numero totale
	public NomeNumeroDTO getNomiProrietariETotaleRubriche(){
		List<entityRubrica> rubriche = DAO.selectAll();
		List<String> nomiPriprietari = new ArrayList<>();
		
		for (entityRubrica rubrica : rubriche);
		
	}
}
