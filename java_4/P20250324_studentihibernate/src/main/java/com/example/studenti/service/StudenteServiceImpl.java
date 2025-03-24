package com.example.studenti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.studenti.dao.DaoStudente;
import com.example.studenti.dto.StudenteDTO;
import com.example.studenti.entity.Studente;
import com.example.studenti.utility.conversioni;

@Service
@Transactional
public class StudenteServiceImpl implements StudenteService {
	
	@Autowired
	private DaoStudente dao;
	
	@Override
	public boolean immatricola(StudenteDTO dto) {
		Studente entity = conversioni.fromStudenteDTOToStudente(dto);
	
		return dao.save(entity) != null;
	}
	

	@Override
	public StudenteDTO cerca(Integer matricola) {
		Optional<Studente> opt = dao.findById(matricola);
		if(opt.isPresent()) {
			Studente st = opt.get();
			return new StudenteDTO(st.getMatricola(), st.getNome(), st.getCognome(), st.getAnnoImm());
		}
		else
			return null;
	}
	
	
	public List<StudenteDTO> selectAll(){
		return null;
	}
	
	
	public boolean elimina(Integer matricola) {
		dao.deleteById(matricola);
		return true;
	}
	
	@Override
	public boolean eliminatutti() {
		dao.deleteAll();
		return true;
	}

}
