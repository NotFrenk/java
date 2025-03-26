package com.spring.rubrica.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.rubrica.dao.DaoRubrica;
import com.spring.rubrica.dto.ContattoDto;
import com.spring.rubrica.dto.RubricaDto;
import com.spring.rubrica.entity.Rubrica;
import com.spring.rubrica.utility.Conversioni;


@Service
@Transactional
public class RubricaServiceImpl implements RubricaService {
	
	@Autowired // fa la classe 
	private DaoRubrica dao;
	
	@Override
	public boolean creaRubrica(RubricaDto dto) {
		// TODO Auto-generated method stub
		Rubrica rb = Conversioni.daRubricaDtoARubrica(dto);
		dao.save(rb);
		return true;
	}

	@Override
	public RubricaDto cerca(Integer idRubrica) {
		Optional<Rubrica> opt = dao.findById(idRubrica);
		if (opt.isPresent()) {
			Rubrica trovata = opt.get();
			return Conversioni.daRubricaARubricaDto(trovata);
		}
		return null;
	}

	@Override
	public boolean aggiungiContatto(Integer idRubrica, ContattoDto dto) {
		
		Optional<Rubrica> opt = dao.findById(idRubrica);
		if (opt.isPresent()) {
			Rubrica trovata = opt.get();
			trovata.aggiungiContatto(Conversioni.daContattoDtoAContatto(dto));
			return true;
		}
		return false;
	}

}