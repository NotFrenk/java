package esame;

import java.util.List;

public abstract class Prodotto {
	private int ID_prodotto;
	private String name;
	private Double price;
	private String descrizione;
	private List<String> negozi;
	
	public Prodotto(int iD_prodotto, String name, Double price, String descrizione, List<String> negozi) {
		super();
		this.ID_prodotto = iD_prodotto;
		this.name = name;
		this.price = price;
		this.descrizione = descrizione;
		this.negozi=negozi;
	}

	public int getID_prodotto() {
		return ID_prodotto;
	}

	public void setID_prodotto(int iD_prodotto) {
		ID_prodotto = iD_prodotto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public List<String> getNegozi() {
	        return negozi;
	}

	public void setNegozi(List<String> negozi) {
	        this.negozi = negozi;
	}

	@Override
	public String toString() {
		return "Prodotto [ID_prodotto=" + ID_prodotto + ", name=" + name + ", price=" + price + ", descrizione="
				+ descrizione + ", negozi=" + negozi + "]";
	}
	
	
}
