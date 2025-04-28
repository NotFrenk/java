package com.spirng.rub.dto;

public class ProprietarioAnnoDTO {
    private String nomeProprietario;
    private int annoCreazione;
    
	public ProprietarioAnnoDTO() {
		super();
	}

	public ProprietarioAnnoDTO(String nomeProprietario, int annoCreazione) {
		super();
		this.nomeProprietario = nomeProprietario;
		this.annoCreazione = annoCreazione;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public int getAnnoCreazione() {
		return annoCreazione;
	}

	public void setAnnoCreazione(int annoCreazione) {
		this.annoCreazione = annoCreazione;
	}
    
    
}
