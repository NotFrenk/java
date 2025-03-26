package com.spring.rubrica.service;


import com.spring.rubrica.dto.ContattoDto;
import com.spring.rubrica.dto.RubricaDto;

public interface RubricaService {
	public boolean creaRubrica(RubricaDto dto);
	public RubricaDto cerca(Integer idRubrica);
	public boolean aggiungiContatto(Integer idRubrica, ContattoDto dto);
}