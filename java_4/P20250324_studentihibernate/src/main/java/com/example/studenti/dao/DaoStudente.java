package com.example.studenti.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.studenti.entity.Studente;

public interface DaoStudente extends JpaRepository<Studente, Integer>{
	
	// qui ci sono gia in eredita tutte le funzioni CRUD
	
	//aggiungo query native
	
	@Query(nativeQuery = true, value = "select * from studente where anno_imm > :annoImmatr")
	public List<Studente> getGiovani(int annoImmatr);
	
}
