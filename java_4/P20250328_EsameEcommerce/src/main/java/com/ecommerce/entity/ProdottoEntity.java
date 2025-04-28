package com.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProdottoEntity {
	
	@Id
	private int IdProdotto;
	
	private String descrizione, categoria;
	private int quantita, sconto;
	private double prezzo;
	
	public ProdottoEntity() {
		super();
	}

	public ProdottoEntity(int idProdotto, String descrizione, String categoria, int quantita, int sconto,
			double prezzo) {
		super();
		IdProdotto = idProdotto;
		this.descrizione = descrizione;
		this.categoria = categoria;
		this.quantita = quantita;
		this.sconto = sconto;
		this.prezzo = prezzo;
	}

	public int getIdProdotto() {
		return IdProdotto;
	}

	public void setIdProdotto(int idProdotto) {
		IdProdotto = idProdotto;
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

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public int getSconto() {
		return sconto;
	}

	public void setSconto(int sconto) {
		this.sconto = sconto;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
}
