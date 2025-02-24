package com.example.uni.dao;

import java.util.List;

import com.example.uni.entity.Professori;

public interface DAOProfessori {
	
	public boolean insert(Professori professori);
	public List<Professori> selectAll();
	public Professori selectByid(Integer idProf);
	public boolean delete(Integer idProf);
}
