package com.spring.report.entity;

public class prodotto {
	
	private int id, quantita;
	private String marca, modello, descrizione, categoria;
	private Double prezzo_max, prezzo_cons;
	
	public prodotto() {
		super();
	}

	public prodotto(int id, int quantita, String marca, String modello, String descrizione, String categoria,
			Double prezzo_max, Double prezzo_cons) {
		super();
		this.id = id;
		this.quantita = quantita;
		this.marca = marca;
		this.modello = modello;
		this.descrizione = descrizione;
		this.categoria = categoria;
		this.prezzo_max = prezzo_max;
		this.prezzo_cons = prezzo_cons;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantia() {
		return quantita;
	}

	public void setQuantia(int quantia) {
		this.quantita = quantia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getPrezzo_max() {
		return prezzo_max;
	}

	public void setPrezzo_max(Double prezzo_max) {
		this.prezzo_max = prezzo_max;
	}

	public Double getPrezzo_cons() {
		return prezzo_cons;
	}

	public void setPrezzo_cons(Double prezzo_cons) {
		this.prezzo_cons = prezzo_cons;
	}
	
	
}
