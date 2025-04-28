package com.spirng.rub.service;

import java.util.List;

import com.spirng.rub.dto.NomeNumeroDTO;
import com.spirng.rub.dto.ProprietarioAnnoDTO;
import com.spirng.rub.dto.RubricaDTO;

public interface RubricaService {
	
	public boolean aggiungiRubrica (RubricaDTO dto);
	public RubricaDTO trovaRubricaPerId(int id);
	public List<RubricaDTO> tutteRubriche();
	public boolean cancellaRubrica(int id);
	public ProprietarioAnnoDTO visualizzaProprietarioAnno(int id);
	public RubricaDTO modificaProprietario(int id, String nuovoNome);
	public RubricaDTO modificaAnnoCreazione(int id, int nuovoAnno);
	public NomeNumeroDTO visualizzaProprietariENumeroRubriche();
}
