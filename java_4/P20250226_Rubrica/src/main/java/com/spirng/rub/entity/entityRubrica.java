package com.spirng.rub.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class entityRubrica {
	
    private int id;
    private String nomeProprietario;
    private LocalDate annoCreazione;
    private List<entityContattoTelefonico> contatti = new ArrayList<>();
    
	public entityRubrica() {
		super();
	}

	public entityRubrica(int id, String nomeProprietario, LocalDate annoCreazione, List<entityContattoTelefonico> contatti) {
		super();
		this.id = id;
		this.nomeProprietario = nomeProprietario;
		this.annoCreazione = annoCreazione;
		this.contatti = contatti;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public LocalDate getAnnoCreazione() {
		return annoCreazione;
	}

	public void setAnnoCreazione(LocalDate annoCreazione) {
		this.annoCreazione = annoCreazione;
	}

	public List<entityContattoTelefonico> getContatti() {
		return contatti;
	}

	public void setContatti(List<entityContattoTelefonico> contatti) {
		this.contatti = contatti;
	}

	
    
}