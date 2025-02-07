package esame;

import java.util.List;

public class Televisore extends Prodotto{
	private int dimensioni;
	private boolean smartTV;
	
	public Televisore(int iD_prodotto, String name, Double price, String descrizione, List<String> negozi,int dimensioni,boolean smartTV) {
		super(iD_prodotto, name, price, descrizione, negozi);
		this.dimensioni = dimensioni;
		this.smartTV = smartTV;
	}

	public int getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	public boolean isSmartTV() {
		return smartTV;
	}

	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}

	@Override
	public String toString() {
		return "Televisore [dimensioni=" + dimensioni + ", smartTV=" + smartTV + "]";
	}
	
	

}
