import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazzo {
	//Attributo: lista di carte
	private List<Carta> carte;

	public Mazzo() {
	    carte = new ArrayList<>();
	    inizializzaMazzo();
	}
	
	//metodo per creare tutte le carte del mazzo
	private void inizializzaMazzo() {
		String[] semi = {"Coppe","Denari","Spade","Bastoni"};
		
		//aggiungi carte numeriche (1-7)
		for (String seme : semi) {
			for (int valore = 1; valore <= 7; valore ++) {
				carte.add(new Carta(valore, seme, false));
			}
		}
		
		//aggiungi figure
		for (String seme : semi) {
			for (int i=0; i<3; i++) {//3 figure per ogni utente
				carte.add(new Carta(0.5, seme, false));
			}
		}
		
		//aggiungi la matta
		carte.add(new Carta(0.5, "Denari", true));
	}
	
	//metodo per mischiare il mazzo 
	public void mischia() {
		Collections.shuffle(carte);
	}
	
	//metodo per pescare una carta
	public Carta pescaCarta() {
		if (carte.isEmpty()) {
			throw new IllegalStateException("il mazzo è vuoto");
		}
		return carte.remove(0); // Rimuovi e restituisci la prima carta
	}
	
	//Metodo per ottenere il numero di carte rimaste
	public int carteRimaste() {
		return carte.size();	
	}
}
