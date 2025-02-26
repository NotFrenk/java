package com.spring.university.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.university.dao.DAOProfessori;
import com.spring.university.dto.ProfessoreDTO;
import com.spring.university.entity.Professore;
import com.spring.university.utility.Conversioni;

@Service
public class ProfessoreServiceImpl implements ProfessoreService {

	@Autowired
	private DAOProfessori dao;

//Inserisci nuovo professore
	public boolean aggiungi(ProfessoreDTO dto) {
		Professore professore = Conversioni.daProfessoreDTOaProfessore(dto);

		return dao.insert(professore);
	}

//Cerca professore per id
	public ProfessoreDTO cercaPerID(int id) {
		Professore professore = dao.selectById(id);

		if (professore != null) {
			ProfessoreDTO dto = Conversioni.daProfessoreAProfessoreDTO(professore);
			return dto;
		}
		return null;
	}

//Visualizza tutti i professori
	public List<ProfessoreDTO> mostraTutti() {
		List<Professore> professori = dao.selectAll();
		List<ProfessoreDTO> dto = new ArrayList<>();

		for (Professore professore : professori) {
			dto.add(Conversioni.daProfessoreAProfessoreDTO(professore));
		}
		return dto;
	}

//Cancella un professore (specificando l’id)
	public boolean deleteById(int id) {
		return dao.delete(id);
	}

//Modifica materia del professore (specificando l’id prof e la nuova
	public ProfessoreDTO changeMateria(int id, String materia) {
		Professore professore = dao.selectById(id);

		if (professore != null) {
			professore.setMateriaInsegniamento(materia);
//Converto
			ProfessoreDTO dto = Conversioni.daProfessoreAProfessoreDTO(professore);
			return dto;
		}
		return null;
	}
}