package com.spring.university.dto;

public class ProfessoreDTO {
	private int id;
	private String nome, cognome, materiaInsegniamento;

	public ProfessoreDTO() {
	}

	public ProfessoreDTO(int id, String nome, String cognome, String materiaInsegniamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.materiaInsegniamento = materiaInsegniamento;
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

	public String getMateriaInsegniamento() {
		return materiaInsegniamento;
	}

	public void setMateriaInsegniamento(String materiaInsegniamento) {
		this.materiaInsegniamento = materiaInsegniamento;
	}

}