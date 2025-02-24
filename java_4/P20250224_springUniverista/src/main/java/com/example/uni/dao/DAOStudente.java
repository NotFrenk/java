package com.example.uni.dao;

import java.util.List;

import com.example.uni.entity.Studenti;

public interface DAOStudente {
	
	public boolean insert(Studenti studenti);
	public List<Studenti> selectAll();
	public Studenti selectByMatricola(Integer matricolaStud);
	public boolean delete(Integer matricolaStud);
}
