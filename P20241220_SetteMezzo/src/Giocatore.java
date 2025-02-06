import java.util.ArrayList;
import java.util.List;

public class Giocatore {
	private String nome;
	private List<Carta> mano;//carte in mano al giocatore 
	private double punteggio; // Punteggio corrente del giocatore
	
    // Costruttore
    public Giocatore(String nome) {
        this.nome = nome;
        this.mano = new ArrayList<>();
        this.punteggio = 0.0;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Carta> getMano() {
		return mano;
	}

	public void setMano(List<Carta> mano) {
		this.mano = mano;
	}

	public double getPunteggio() {
		return punteggio;
	}

	public void setPunteggio(double punteggio) {
		this.punteggio = punteggio;
	}
	
	// metodo per aggiungere una carta alla mano
	public void aggiungiCarta(Carta carta) {
		mano.add(carta);
		calcolaPunteggio(); //aggiorna il punteggio ogni volta che vieni aggiunta una carta 
	}
	
	//metodo per calcolare il punteggio della mano
	private void calcolaPunteggio() {
		double nuovoPunteggio = 0.0;
		for (Carta carta : mano) {
			if (carta.isMatta()) {
				//la matta vine cosiderata inizialmente come 0,5 punti
				nuovoPunteggio += 0.5;
			} else {
				nuovoPunteggio += carta.getValore();
			}
		}
		this.punteggio = nuovoPunteggio;
	}
	
	//metodo per mostrare le carte in mano
	public String mostraMano() {
		StringBuilder sb = new StringBuilder();
		for (Carta carta : mano) {
			sb.append(carta.toString()).append("\n");
		}
		return sb.toString();
	}


    // Metodo per decidere il valore della Matta
    public void scegliValoreMatta(double valore) {
        for (Carta carta : mano) {
            if (carta.isMatta()) {
                punteggio -= 0.5; // Rimuovi il valore predefinito della Matta
                punteggio += valore; // Aggiungi il nuovo valore scelto
                break;
            }
        }
    }

    // Metodo per verificare se il giocatore ha "sballato"
    public boolean haSballato() {
        return punteggio > 7.5;
    }
}
