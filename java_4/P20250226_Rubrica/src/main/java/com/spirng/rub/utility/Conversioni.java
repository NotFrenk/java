package com.spirng.rub.utility;

import com.spirng.rub.dto.ContattoDTO;
import com.spirng.rub.dto.RubricaDTO;
import com.spirng.rub.entity.entityContattoTelefonico;
import com.spirng.rub.entity.entityRubrica;


public class Conversioni {
	
	public static entityRubrica daRubricaDTOaRubrica(RubricaDTO dto) {
		return new entityRubrica(dto.getId(), dto.getNomeProprietario(), dto.getAnnoCreazione(), dto.getContatti());
	}

	public static RubricaDTO daRubricaARubricaDTO(entityRubrica entity) {
		return new RubricaDTO(entity.getId(), entity.getNomeProprietario(), entity.getAnnoCreazione(), entity.getContatti());
	}
	
	public static entityContattoTelefonico daContattoDTOAContatto(ContattoDTO dto) {
		return new entityContattoTelefonico(dto.getIdContatto(), dto.getNome(), dto.getCognome(), dto.getGruppoAppartenenza(), dto.getDataNascita(), false);
	}
	
	public static ContattoDTO daEntityContattoAContattoDTO(entityContattoTelefonico entity) {
		return new ContattoDTO(entity.getIdContatto(), entity.getNome(), entity.getCognome(), entity.getGruppoAppartenenza(), entity.getDataNascita(), false);
	}
	
	
}
