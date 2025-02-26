package com.spring.university.service;

import java.util.List;

import com.spring.university.dto.ProfessoreDTO;

public interface ProfessoreService {
	public boolean aggiungi(ProfessoreDTO dto);
	public ProfessoreDTO cercaPerID(int id);
	public List<ProfessoreDTO> mostraTutti();
	public boolean deleteById(int id);
	public ProfessoreDTO changeMateria(int id, String materia);
}
