package com.spirng.rub.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spirng.rub.entity.entityRubrica;

@Repository
public class DAORubricaMappaImpl implements DAORubricaMappa{
	
	private Map<Integer, entityRubrica> mappa = new HashMap<>();

	public boolean insert(entityRubrica rubrica) {
		if(mappa.containsKey(rubrica.getId()))
			return false;
		
		mappa.put(rubrica.getId(), rubrica);
		return true;
	}
	
	public List<entityRubrica> selectAll(){
		return new ArrayList<>(mappa.values());
	}

	public entityRubrica selectById(Integer idRubrica) {
		return mappa.get(idRubrica);
	}
	
	public boolean delete(Integer idRubrica) {
		entityRubrica rubrica = mappa.remove(idRubrica);
		return rubrica!=null;
	}

}
