package com.spring.university.utility;

import com.spring.university.dto.ProfessoreDTO;
import com.spring.university.dto.StudenteDTO;
import com.spring.university.entity.Professore;
import com.spring.university.entity.Studente;

public class Conversioni {

	public static Studente daStudenteDTOaStudente(StudenteDTO dto) {
		return new Studente(dto.getMatricola(), dto.getNome(), dto.getCognome(), dto.getIndirizzo(),
				dto.getAnnoNascita(), dto.getAnnoMatricolazione());
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