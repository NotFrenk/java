package com.spirng.rub.dto;

import java.sql.Date;
import java.time.LocalDate;


public class ContattoDTO {
	
    private int idContatto;
    private String nome;
    private String cognome;
    private String gruppoAppartenenza = "default";
    private Date dataNascita;
    private boolean preferito = false;
    private int telefono;
    
	public ContattoDTO() {
		super();
	}

	public ContattoDTO(int idContatto, String nome, String cognome, String gruppoAppartenenza,
			Date dataNascita, boolean preferito, int telefono) {
		super();
		this.idContatto = idContatto;
		this.nome = nome;
		this.cognome = cognome;
		this.gruppoAppartenenza = gruppoAppartenenza;
		this.dataNascita = dataNascita;
		this.preferito = preferito;
		this.setTelefono(telefono);
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

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public boolean isPreferito() {
		return preferito;
	}

	public void setPreferito(boolean preferito) {
		this.preferito = preferito;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
    
    
	
}