package com.spring.university.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.university.entity.Professore;

@Repository

public class ProfessoriDAOMappaImpl implements DAOProfessori {
	
	private Map<Integer, Professore> mappa = new HashMap<>();

	public boolean insert(Professore professore) {
	if(mappa.containsKey(professore.getId()))
	return false;

	mappa.put(professore.getId(), professore);
	return true;

	}

	public List<Professore> selectAll(){
	return new ArrayList<>(mappa.values());
	}

	public Professore selectById(Integer idProf) {
	return mappa.get(idProf);
	}

	public boolean delete(Integer idProf) {
	Professore professore = mappa.remove(idProf);
	return professore !=null;
	}

	public boolean changeMateria(Integer idProf, String materia) {
	Professore professore = selectById(idProf);
	if (professore == null) {
	return false;
	}
	professore.setMateriaInsegniamento(materia);
	return true;
	}
	}

