package com.spring.university.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.university.dao.DAOStudenti;
import com.spring.university.dto.StudenteDTO;
import com.spring.university.entity.Studente;
import com.spring.university.utility.Conversioni;

@Service
public class StudenteServiceImpl implements StudenteService {

	@Autowired
	private DAOStudenti dao;

//inserisci nuovo studente
	public boolean aggiungi(StudenteDTO dto) {
		Studente studente = Conversioni.daStudenteDTOaStudente(dto);

		return dao.insert(studente);
	}

// cerca studente per matricola
	public StudenteDTO cercaPerMatricola(Integer matricola) {
// chiamo il DAO
		Studente studente = dao.selectByMatricola(matricola);

		if (studente != null) {
			StudenteDTO dto = Conversioni.daStudenteAStudenteDTO(studente);
			return dto;
		}
		return null;
	}

// visualizza tutti gli studenti
	public List<StudenteDTO> mostraTutti() {
		List<Studente> studenti = dao.selectAll();
		List<StudenteDTO> studentiDTO = new ArrayList<>();

		for (Studente studente : studenti) {
			studentiDTO.add(Conversioni.daStudenteAStudenteDTO(studente));
		}

		return studentiDTO;
	}

//Cancella uno studente (specificando la matricola)
	public boolean deleteByMatricola(int matricola) {
		return dao.delete(matricola);
	}

//Modifica indirizzo studente (specificando la matricola e il nuovo indirizzo)
	public StudenteDTO changeAdress(int matricola, String indirizzo) {
		Studente studente = dao.selectByMatricola(matricola);

		if (studente != null) {
			studente.setIndirizzo(indirizzo);
//Converto per ritornare un DTO, serve al controller
			StudenteDTO dto = Conversioni.daStudenteAStudenteDTO(studente);
			return dto;
		}
		return null;

	}
}