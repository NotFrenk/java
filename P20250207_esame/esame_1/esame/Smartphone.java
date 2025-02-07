package esame;

import java.util.List;

public class Smartphone extends Prodotto{

	private int MemoriaInterna;
	private String SistemaOperativo;

	public Smartphone(int iD_prodotto, String name, Double price, String descrizione, List<String> negozi, String SistemaOperativo, int MemoriaInterna) {
		super(iD_prodotto, name, price, descrizione, negozi);
		this.SistemaOperativo = SistemaOperativo;
		this.MemoriaInterna = MemoriaInterna;
	}

	public Smartphone(int iD_prodotto, String name, Double price, String descrizione, List<String> negozi,
			int memoriaInterna, String sistemaOperativo) {
		super(iD_prodotto, name, price, descrizione, negozi);
		MemoriaInterna = memoriaInterna;
		SistemaOperativo = sistemaOperativo;
	}

	public int getMemoriaInterna() {
		return MemoriaInterna;
	}

	public void setMemoriaInterna(int memoriaInterna) {
		MemoriaInterna = memoriaInterna;
	}

	public String getSistemaOperativo() {
		return SistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		SistemaOperativo = sistemaOperativo;
	}

	@Override
	public String toString() {
		return "Smartphone [MemoriaInterna=" + MemoriaInterna + ", SistemaOperativo=" + SistemaOperativo + "]";
	}
	

}
