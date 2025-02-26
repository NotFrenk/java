package com.spring.university.entity;

public class Professore {
	private int id;
	private String nome, cognome, materiaInsegniamento;

	public Professore() {
	}

	public Professore(int id, String nome, String cognome, String materiaInsegniamento) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.materiaInsegniamento = materiaInsegniamento;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getMateriaInsegniamento() {
		return materiaInsegniamento;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setMateriaInsegniamento(String materiaInsegniamento) {
		this.materiaInsegniamento = materiaInsegniamento;
	}

}