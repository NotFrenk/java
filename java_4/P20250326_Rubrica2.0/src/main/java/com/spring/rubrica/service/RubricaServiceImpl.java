package com.spring.rubrica.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.rubrica.dao.DaoRubrica;
import com.spring.rubrica.dto.ContattoDto;
import com.spring.rubrica.dto.ProprietarioAnnoDTO;
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
	public List<RubricaDto> tutteRubriche() {
		return dao.findAll().stream()
				.map(t -> new RubricaDto(t.getIdRubrica(), t.getProprietario(), t.getAnnoCreazione()))
				.collect(Collectors.toList());
	}

	@Override
	public boolean eliminaRubrica(Integer idRubrica) {
		Optional<Rubrica> opt = dao.findById(idRubrica);
		if (dao.existsById(idRubrica)) {
			Rubrica rub = opt.get();
			dao.delete(rub);
			return true;
		}
		return false;
	}

	public ProprietarioAnnoDTO soloPropAnno(Integer idRubrica) {
		Optional<Rubrica> opt = dao.findById(idRubrica);
		if (opt.isPresent()) {
			Rubrica rub = opt.get();
			return Conversioni.FromRubricaToPropAnnoDTO(rub);
		}
		return null;
	}

	public RubricaDto modificaNome(Integer idRubrica, String nuovoNome) {
		Optional<Rubrica> opt = dao.findById(idRubrica);
		if (opt.isPresent()) {
			Rubrica rub = opt.get();
			rub.setProprietario(nuovoNome);
			return Conversioni.daRubricaARubricaDto(rub);
		}
		return null;
	}

	// funzionalità CONTATTO
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