package com.example.studenti.utility;

import java.util.ArrayList;
import java.util.List;

import com.example.studenti.dto.StudenteDTO;
import com.example.studenti.entity.Studente;

public class conversioni {
	
	public static Studente fromStudenteDTOToStudente(StudenteDTO dto) {
		return new Studente(dto.getMatricola(), dto.getNome(), dto.getCognome(), dto.getAnnoImm());
	}
	
	public static StudenteDTO fromStudenteToStudenteDTO(Studente entity) {
		return new StudenteDTO(entity.getMatricola(), entity.getNome(), entity.getCognome(), entity.getAnnoImm());
	}
	
	public static List<StudenteDTO> fromStudentiToStudentiDTO(List<Studente> ls){
		List<StudenteDTO> ldto = new ArrayList<StudenteDTO>();
		
		for(Studente s : ls)
			ldto.add(fromStudenteToStudenteDTO(s));
		return ldto;
	}

}
