package com.example.uni.entity;

public class Professori {

	private int id;
	private String nome, cognome, materia_insegnata;
	
	public Professori() {
		super();
	}

	public Professori(int id, String nome, String cognome, String materia_insegnata) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.materia_insegnata = materia_insegnata;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getMateria_insegnata() {
		return materia_insegnata;
	}

	public void setMateria_insegnata(String materia_insegnata) {
		this.materia_insegnata = materia_insegnata;
	}
	
	
	
}
