package com.example.uni.dao;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.uni.entity.Professori;

@Repository
public class DAOProfessoreMappaImpl implements DAOProfessori {

	private Map<Integer, Professori> mappa = new HashMap<>();

	public boolean insert(Professori professori) {
		if (mappa.containsKey(professori.getId()))
			return false;

		mappa.put(professori.getId(), professori);
		return true;
	}

	public List<Professori> selectAll() {
		return new ArrayList<>(mappa.values());
	}

	public Professori selectByid(Integer idProf) {
		return mappa.get(idProf);
	}

	public boolean delete(Integer idProf) {
		Professori professori = mappa.remove(idProf);
		return professori != null;
	}

}
