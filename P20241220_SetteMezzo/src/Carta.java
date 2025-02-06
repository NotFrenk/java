
public class Carta {
	private double valore; //Es. 1 per Asso, 0,5 per figure
	private String seme; //Es. "Coppe", "Denari"
	private boolean isMatta; // True se è la Matta (Re di Denari)
	
	//costruttore
	public Carta(double valore, String seme, boolean isMatta) {
		super();
		this.valore = valore;
		this.seme = seme;
		this.isMatta = isMatta;
	}

	public Carta() {
		super();
	}

	public double getValore() {
		return valore;
	}

	public void setValore(double valore) {
		this.valore = valore;
	}

	public String getSeme() {
		return seme;
	}

	public void setSeme(String seme) {
		this.seme = seme;
	}

	public boolean isMatta() {
		return isMatta;
	}

	public void setMatta(boolean isMatta) {
		this.isMatta = isMatta;
	}
	
	
	//Metodo per calcolare il punteggio della carta 
	public double calcolaPunteggio(double sceltaMatta) {
		if (isMatta) {
			return sceltaMatta; //Valore scelto dal giocatore per la matta (0.5 o 1-7)
		} else {
			return valore; //Valore normale della carta
		}
	}

	@Override
	public String toString() {
		if (isMatta) {
			return "Re di Denari (MATTA)";
		} else {
			return valore + " di " + seme;
		}
	}
	
}
