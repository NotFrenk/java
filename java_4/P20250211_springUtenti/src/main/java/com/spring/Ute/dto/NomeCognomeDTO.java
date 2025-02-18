package com.spring.Ute.dto;

public class NomeCognomeDTO {
	
	private String nome,congome;

	public NomeCognomeDTO() {
		super();
	}

	public NomeCognomeDTO(String nome, String congome) {
		super();
		this.nome = nome;
		this.congome = congome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCongome() {
		return congome;
	}

	public void setCongome(String congome) {
		this.congome = congome;
	}
	

}
