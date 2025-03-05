package com.spirng.rub.entity;

import java.time.LocalDate;


public class entityContattoTelefonico {
	
    private int idContatto;
    private String nome;
    private String cognome;
    private String gruppoAppartenenza = "default";
    private LocalDate dataNascita;
    private boolean preferito = false;
    
	public entityContattoTelefonico() {
		super();
	}

	public entityContattoTelefonico(int idContatto, String nome, String cognome, String gruppoAppartenenza,
			LocalDate dataNascita, boolean preferito) {
		super();
		this.idContatto = idContatto;
		this.nome = nome;
		this.cognome = cognome;
		this.gruppoAppartenenza = gruppoAppartenenza;
		this.dataNascita = dataNascita;
		this.preferito = preferito;
	}

	public int getIdContatto() {
		return idContatto;
	}

	public void setIdContatto(int idContatto) {
		this.idContatto = idContatto;
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

	public String getGruppoAppartenenza() {
		return gruppoAppartenenza;
	}

	public void setGruppoAppartenenza(String gruppoAppartenenza) {
		this.gruppoAppartenenza = gruppoAppartenenza;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public boolean isPreferito() {
		return preferito;
	}

	public void setPreferito(boolean preferito) {
		this.preferito = preferito;
	}
    
    
	
}