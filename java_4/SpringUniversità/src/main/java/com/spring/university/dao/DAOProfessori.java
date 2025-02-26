package com.spring.university.dao;

import java.util.List;
import com.spring.university.entity.Professore;

public interface DAOProfessori {
	public boolean insert(Professore professore);
	public List<Professore> selectAll();
	public Professore selectById(Integer idProf);
	public boolean delete(Integer idProf);
	public boolean changeMateria(Integer idProf, String materia);
}
