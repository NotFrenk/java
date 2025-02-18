package com.spring.report.dto;

import java.util.List;

public class ReportDTO {
	
	 private int n_pezzi_disp, n_pezzi_NonDisp ;
	 private double media_prez;
	 private List<String> prodottiDisponibili;
	 private List<String> prodottiNonDisponibili;
	 private List<String> descrizioni;
	 
	public ReportDTO() {
		super();
	}

	public ReportDTO(int n_pezzi_disp, int n_pezzi_NonDisp, double media_prez, List<String> prodottiDisponibili,
			List<String> prodottiNonDisponibili, List<String> descrizioni) {
		super();
		this.n_pezzi_disp = n_pezzi_disp;
		this.n_pezzi_NonDisp = n_pezzi_NonDisp;
		this.media_prez = media_prez;
		this.prodottiDisponibili = prodottiDisponibili;
		this.prodottiNonDisponibili = prodottiNonDisponibili;
		this.descrizioni = descrizioni;
	}

	public int getN_pezzi_disp() {
		return n_pezzi_disp;
	}

	public void setN_pezzi_disp(int n_pezzi_disp) {
		this.n_pezzi_disp = n_pezzi_disp;
	}

	public int getN_pezzi_NonDisp() {
		return n_pezzi_NonDisp;
	}

	public void setN_pezzi_NonDisp(int n_pezzi_NonDisp) {
		this.n_pezzi_NonDisp = n_pezzi_NonDisp;
	}

	public double getMedia_prez() {
		return media_prez;
	}

	public void setMedia_prez(double media_prez) {
		this.media_prez = media_prez;
	}

	public List<String> getProdottiDisponibili() {
		return prodottiDisponibili;
	}

	public void setProdottiDisponibili(List<String> prodottiDisponibili) {
		this.prodottiDisponibili = prodottiDisponibili;
	}

	public List<String> getProdottiNonDisponibili() {
		return prodottiNonDisponibili;
	}

	public void setProdottiNonDisponibili(List<String> prodottiNonDisponibili) {
		this.prodottiNonDisponibili = prodottiNonDisponibili;
	}

	public List<String> getDescrizioni() {
		return descrizioni;
	}

	public void setDescrizioni(List<String> descrizioni) {
		this.descrizioni = descrizioni;
	}
	
}
