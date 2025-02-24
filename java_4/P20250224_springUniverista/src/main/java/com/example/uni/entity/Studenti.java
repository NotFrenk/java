package com.example.uni.entity;

public class Studenti {
	
	private int matricola, anno_nascita, anno_immatricolazione;
	private String nome, cognome, indirizzo;
	
	public Studenti() {
		super();
	}

	public Studenti(int matricola, int anno_nascita, int anno_immatricolazione, String nome, String cognome,
			String indirizzo) {
		super();
		this.matricola = matricola;
		this.anno_nascita = anno_nascita;
		this.anno_immatricolazione = anno_immatricolazione;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public int getAnno_nascita() {
		return anno_nascita;
	}

	public void setAnno_nascita(int anno_nascita) {
		this.anno_nascita = anno_nascita;
	}

	public int getAnno_immatricolazione() {
		return anno_immatricolazione;
	}

	public void setAnno_immatricolazione(int anno_immatricolazione) {
		this.anno_immatricolazione = anno_immatricolazione;
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

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	
}
