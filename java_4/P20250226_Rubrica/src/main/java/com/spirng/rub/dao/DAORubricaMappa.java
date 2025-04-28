package com.spirng.rub.dao;

import java.util.List;

import com.spirng.rub.entity.entityRubrica;

public interface DAORubricaMappa {
	
	public boolean insert(entityRubrica rubrica);
	public List<entityRubrica> selectAll();
	public entityRubrica selectById(Integer idRubrica);
	public boolean delete(Integer idRubrica);
}
