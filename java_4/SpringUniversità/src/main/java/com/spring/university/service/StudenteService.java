package com.spring.university.service;

import java.util.List;

import com.spring.university.dto.StudenteDTO;

public interface StudenteService {
	public boolean aggiungi(StudenteDTO dto);
	public StudenteDTO cercaPerMatricola(Integer matricola);
	public List<StudenteDTO> mostraTutti();
	public boolean deleteByMatricola(int matricola);
	public StudenteDTO changeAdress(int matricola, String indirizzo);
}
