package com.example.uni.dao;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.uni.entity.Studenti;

@Repository
public class DAOStudenteMappaImpl implements DAOStudente{

	private Map<Integer, Studenti> mappa = new HashMap<>();

	public boolean insert(Studenti studenti) {
		if(mappa.containsKey(studenti.getMatricola()))
			return false;
		
		mappa.put(studenti.getMatricola(), studenti);
		return true;
	}
	
	public List<Studenti> selectAll(){
		return new ArrayList<>(mappa.values());
	}

	public Studenti selectByMatricola(Integer matricolaStud) {
		return mappa.get(matricolaStud);
	}
	
	public boolean delete(Integer matricolaStud) {
		Studenti studenti = mappa.remove(matricolaStud);
		return studenti!=null;
	}

}


