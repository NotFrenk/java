package com.spirng.rub.dto;

import java.util.List;

public class NomeNumeroDTO {
	private List<String> nomiProprietari;
	private int numeroTotaleRubriche;
	
	public NomeNumeroDTO() {
		super();
	}

	public List<String> getNomiProprietari() {
		return nomiProprietari;
	}

	public void setNomiProprietari(List<String> nomiProprietari) {
		this.nomiProprietari = nomiProprietari;
	}

	public int getNumeroTotaleRubriche() {
		return numeroTotaleRubriche;
	}

	public void setNumeroTotaleRubriche(int numeroTotaleRubriche) {
		this.numeroTotaleRubriche = numeroTotaleRubriche;
	}
	

	
}
