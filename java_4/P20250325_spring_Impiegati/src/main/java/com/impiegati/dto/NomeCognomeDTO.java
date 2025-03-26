package com.impiegati.dto;

public class NomeCognomeDTO {
	
	private String nome,cognome;
	
	public NomeCognomeDTO() {
		super();
	}

	public NomeCognomeDTO(String nome, String cognome) {
		super();
		
		this.nome = nome;
		this.cognome = cognome;
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
	
	
}
