package com.example.studenti.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studenti.entity.Studente;

public interface DaoStudente extends JpaRepository<Studente, Integer>{
	
	// qui ci sono gia in eredita tutte le funzioni CRUD
	
}
