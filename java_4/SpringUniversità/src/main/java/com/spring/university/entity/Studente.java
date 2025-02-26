package com.spring.university.entity;

public class Studente {
	private int matricola;
	private String nome, cognome, indirizzo;
	private int annoNascita, annoMatricolazione;

	public Studente() {
	}

	public Studente(int matricola, String nome, String cognome, String indirizzo, int annoNascita,
			int annoMatricolazione) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.annoNascita = annoNascita;
		this.annoMatricolazione = annoMatricolazione;
	}

	public int getMatricola() {
		return matricola;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public int getAnnoNascita() {
		return annoNascita;
	}

	public int getAnnoMatricolazione() {
		return annoMatricolazione;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}

	public void setAnnoMatricolazione(int annoMatricolazione) {
		this.annoMatricolazione = annoMatricolazione;
	}

}