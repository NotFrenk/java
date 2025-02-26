package com.spring.university.dao;

import java.util.List;
import com.spring.university.entity.Studente;

public interface DAOStudenti {
	public boolean insert(Studente studente);

	public List<Studente> selectAll();

	public Studente selectByMatricola(Integer idStudente);

	public boolean delete(Integer idStudente);
}
