package com.example.studenti.service;

import java.util.List;

import com.example.studenti.dto.StudenteDTO;

public interface StudenteService {
	
	public boolean immatricola(StudenteDTO dto);
	public StudenteDTO cerca (Integer matricola);
	public List<StudenteDTO> selectAll();
	public boolean elimina(Integer matricola);
	public boolean eliminatutti();
}
