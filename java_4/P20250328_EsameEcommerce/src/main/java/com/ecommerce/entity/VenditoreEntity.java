package com.ecommerce.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class VenditoreEntity {
	
	@Id
	private Integer idVenditore;
	
	private String nome, cognome, username, password, via, citta;
	
	@OneToMany (cascade = CascadeType.PERSIST)
	@JoinColumn (name = "FK_Venditore")
	private List<ProdottoEntity> prodotti = new ArrayList<>();

	public VenditoreEntity() {
		super();
	}

	public VenditoreEntity(Integer idVenditore, String nome, String cognome, String username, String password, String via,
			String citta) {
		super();
		this.idVenditore = idVenditore;
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		this.via = via;
		this.citta = citta;
		
	}

	public Integer getidVenditore() {
		return idVenditore;
	}

	public void setidVenditore(Integer idVenditore) {
		this.idVenditore = idVenditore;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public List<ProdottoEntity> getProdotti() {
		return prodotti;
	}

	public void setProdotti(List<ProdottoEntity> prodotti) {
		this.prodotti = prodotti;
	}

	
	
	
}
