package com.spirng.rub.utility;

import com.spirng.rub.dto.ContattoDTO;
import com.spirng.rub.dto.RubricaDTO;
import com.spirng.rub.entity.entityContattoTelefonico;
import com.spirng.rub.entity.entityRubrica;

import ch.qos.logback.core.rolling.helper.FileStoreUtil;

public class Conversioni {
	
	public static entityRubrica daRubricaDTOaRubrica(RubricaDTO dto) {
		return new entityRubrica(dto.getId(), dto.getNomeProprietario(), dto.getAnnoCreazione(), dto.getContatti());
	}

	public static RubricaDTO daRubricaARubricaDTO(entityRubrica dto) {
		return new RubricaDTO(dto.getId(), dto.getNomeProprietario(), dto.getAnnoCreazione(), dto.getContatti());
	}
	
	public static entityContattoTelefonico daContattoDTOAContatto(ContattoDTO dto) {
		return new entityContattoTelefonico(dto.getIdContatto(), dto.getNome(), dto.getCognome(), dto.getGruppoAppartenenza(), dto.getDataNascita(), false);
	}
	
	
	
	
	
	
	
	
	
	
	
	public static StudenteDTO daStudenteAStudenteDTO(Studente entity) {
		return new StudenteDTO(entity.getMatricola(), entity.getNome(), entity.getCognome(), entity.getIndirizzo(),
				entity.getAnnoNascita(), entity.getAnnoMatricolazione());
	}

	public static Professore daProfessoreDTOaProfessore(ProfessoreDTO dto) {
		return new Professore(dto.getId(), dto.getNome(), dto.getCognome(), dto.getMateriaInsegniamento());
	}

	public static ProfessoreDTO daProfessoreAProfessoreDTO(Professore entity) {
		return new ProfessoreDTO(entity.getId(), entity.getNome(), entity.getCognome(),
				entity.getMateriaInsegniamento());
	}

}
