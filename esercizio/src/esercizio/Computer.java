package esercizio;

public class Computer {
	private double prezzo;
	private double peso;
	private double larghezza;
	private double altezza;
	private double profondita;
	private String produttore;
	private int annoDiProduzione;
	
	private static int numeroDiComputerCreati = 0;

	public Computer(double prezzo, double peso, double larghezza, double altezza, double profondita, String produttore,
			int annoDiProduzione) {
		super();
		this.prezzo = prezzo;
		this.peso = peso;
		this.larghezza = larghezza;
		this.altezza = altezza;
		this.profondita = profondita;
		this.produttore = produttore;
		this.annoDiProduzione = annoDiProduzione;
		this.numeroDiComputerCreati ++;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public double getPeso() {
		return peso;
	}

	public double getLarghezza() {
		return larghezza;
	}

	public double getAltezza() {
		return altezza;
	}

	public double getProfondita() {
		return profondita;
	}

	public String getProduttore() {
		return produttore;
	}

	public int getAnnoDiProduzione() {
		return annoDiProduzione;
	}
	
	// metodo per calcolare il numero di computer creati
	public static int getNumeroDiComputerCreati() {
		return numeroDiComputerCreati;
	}

	public void stampaDati() {
		System.out.println("Computer prodotto da: " + produttore);
        System.out.println("Anno di produzione: " + annoDiProduzione);
        System.out.println("Prezzo: " + prezzo + " Euro");
        System.out.println("Peso: " + peso + " Kg");
        System.out.println("Dimensioni (LxAxP): " + larghezza + " x " + altezza + " x " + profondita + " cm");
    }

}

	

