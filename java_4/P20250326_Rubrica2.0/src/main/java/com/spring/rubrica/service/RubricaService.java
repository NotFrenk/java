package com.spring.rubrica.service;


import java.util.List;

import com.spring.rubrica.dto.ContattoDto;
import com.spring.rubrica.dto.ProprietarioAnnoDTO;
import com.spring.rubrica.dto.RubricaDto;

public interface RubricaService {
	public boolean creaRubrica(RubricaDto dto);
	public RubricaDto cerca(Integer idRubrica);
	public List<RubricaDto> tutteRubriche ();
	public boolean eliminaRubrica (Integer idRubrica);
	public ProprietarioAnnoDTO soloPropAnno (Integer idRubrica);
	public RubricaDto modificaNome (Integer idRubica, String nuovoNome);
	
	// funzionalità CONTATTO
	public boolean aggiungiContatto(Integer idRubrica, ContattoDto dto);
}