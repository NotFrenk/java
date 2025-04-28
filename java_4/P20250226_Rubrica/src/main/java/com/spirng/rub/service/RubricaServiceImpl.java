package com.spirng.rub.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spirng.rub.dao.DAORubricaMappa;
import com.spirng.rub.dao.DAORubricaMappaImpl;
import com.spirng.rub.dto.NomeNumeroDTO;
import com.spirng.rub.dto.ProprietarioAnnoDTO;
import com.spirng.rub.dto.RubricaDTO;
import com.spirng.rub.entity.entityRubrica;
import com.spirng.rub.utility.Conversioni;

@Service
public class RubricaServiceImpl implements RubricaService {
	@Autowired
	private DAORubricaMappa dao;

	// inserisci rubrica nuova
	public boolean aggiungiRubrica(RubricaDTO dto) {
		entityRubrica rubrica = Conversioni.daRubricaDTOaRubrica(dto);
		return dao.insert(rubrica);
	}

	// visualizza rubrica per id
	public RubricaDTO trovaRubricaPerId(int id) {
		entityRubrica rubrica = dao.selectById(id);

		if (rubrica != null) {
			RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
			return dto;
		}
		return null;
	}

	// visualizza tutte le rubriche
	public List<RubricaDTO> tutteRubriche() {
		List<entityRubrica> lista = dao.selectAll();
		ArrayList<RubricaDTO> listaDTO = new ArrayList<>();

		for (int i = 0; i < lista.size(); i++) {
			listaDTO.add(Conversioni.daRubricaARubricaDTO(lista.get(i)));
		}
		return listaDTO;
	}

//	Cancella una rubrica esistente
	public boolean cancellaRubrica(int id) {
		return dao.delete(id);
	}
//	Visualizza solo proprietario e anno creazione di una rubrica (passando l’ id)
	public ProprietarioAnnoDTO visualizzaProprietarioAnno(int id) {
		entityRubrica rubrica = dao.selectById(id);
		if (rubrica != null) {
			ProprietarioAnnoDTO dto = Conversioni.daRubricaAProprietarioAnnoDTO(rubrica);
			return dto;
		}
		return null;
	}
	
//	Modifica il nome proprietario di una rubrica esistente (torna la rubrica aggiornata)
	public RubricaDTO modificaProprietario(int id, String nuovoNome) {
		entityRubrica rubrica = dao.selectById(id);
		if (rubrica!= null) {
			rubrica.setNomeProprietario(nuovoNome);
			return Conversioni.daRubricaARubricaDTO(rubrica);
		}
		return null;
	}
	
//	Modifica anno di creazione di una rubrica esistente (torna la rubrica aggiornata)
	public RubricaDTO modificaAnnoCreazione(int id, int nuovoAnno) {
		entityRubrica rubrica = dao.selectById(id);
		if (rubrica != null) {
			rubrica.setAnnoCreazione(nuovoAnno);
			return Conversioni.daRubricaARubricaDTO(rubrica);
		}
		return null;
	}
	
//	Visualizza i nomi di tutti i proprietari delle rubriche e il loro numero totale
	public NomeNumeroDTO visualizzaProprietariENumeroRubriche() {
	    List<entityRubrica> rubriche = dao.selectAll();
	    List<String> nomiProprietari = new ArrayList<>();
	    int numeroTotaleRubriche = rubriche.size();

	    for (entityRubrica rubrica : rubriche) {
	        nomiProprietari.add(rubrica.getNomeProprietario());
	    }

	    return new NomeNumeroDTO(nomiProprietari, numeroTotaleRubriche);
	}
	
//	Visualizza nome proprietario e anno creazione della rubrica più vecchia
//	Visualizza tutti gli anni di creazione (delle rubriche) in ordine crescente
//	Visualizza nome proprietario e numero contatti di una rubrica

}
