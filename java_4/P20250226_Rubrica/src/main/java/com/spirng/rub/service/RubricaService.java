package com.spirng.rub.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.spirng.rub.dto.NomeNumeroDTO;
import com.spirng.rub.dto.RubricaDTO;
import com.spirng.rub.entity.entityRubrica;

public interface RubricaService {
	
	public boolean aggiungiRubrica (RubricaDTO);
	public entityRubrica trovaRubricaPerId(int id);
	public List<entityRubrica> tutteRubriche();
	public boolean eliminaRubrica (int id);
	public String proprietarioAnnoCreazione (int id);
	public entityRubrica modificaNomeProprietario(int id, String nuovoNome);
	public entityRubrica modificaAnnoRubrica(int id, LocalDate nuovoAnno	);
	public NomeNumeroDTO getNomiProprietariETotaleRubriche();
	public String getRubricaPiuVecchia();
	public List<Integer> getAnniCreazioneCrescente();
	public  String getNomePropNumeroContatti(int id);
	
}
