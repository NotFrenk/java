package esame;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private int id_cliente;
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private List<Prodotto> prodottiAquistati;

	public Cliente(int id_cliente, String nome, String cognome, String email, String password) {
		super();
		this.id_cliente = id_cliente;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.prodottiAquistati = new ArrayList<>();
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Prodotto> getProdottiAquistati() {
		return prodottiAquistati;
	}

	public void setProdottiAquistati(List<Prodotto> prodottiAquistati) {
		this.prodottiAquistati = prodottiAquistati;
	}

	// metodo per acquistare i prodotti
	public void acquistaProdotto(Prodotto prodotto) {
		prodottiAquistati.add(prodotto);
	}

	// metodo per stampare i prodotti acqustati
	public void stampaProdottiAcqustati() {
		System.out.println("Il cliente -" + nome + "- -" + cognome + "- ha acquistato:");
		for (Prodotto p : prodottiAquistati) {
			System.out.println(p);
		}
	}

}
