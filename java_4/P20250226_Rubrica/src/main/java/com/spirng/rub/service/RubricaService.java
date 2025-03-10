package com.spirng.rub.service;

import java.util.List;

import com.spirng.rub.dto.RubricaDTO;

public interface RubricaService {
	
	public boolean aggiungiRubrica (RubricaDTO dto);
	public RubricaDTO trovaRubricaPerId(int id);
	public List<RubricaDTO> tutteRubriche();
//	public boolean eliminaRubrica (int id);
//	public String proprietarioAnnoCreazione (int id);
//	public entityRubrica modificaNomeProprietario(int id, String nuovoNome);
//	public entityRubrica modificaAnnoRubrica(int id, LocalDate nuovoAnno	);
//	public NomeNumeroDTO getNomiProprietariETotaleRubriche();
//	public String getRubricaPiuVecchia();
//	public List<Integer> getAnniCreazioneCrescente();
//	public  String getNomePropNumeroContatti(int id);
//	
}
