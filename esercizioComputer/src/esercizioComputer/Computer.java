package esercizioComputer;

import java.util.Random;

public class Computer {
	private double prezzo;
	private double peso;
	private double larghezza;
	private double altezza;
	private double profondita;
	private String produttore;
	private int annoDiProduzione;
	
	private static int numeroDiComputerCreati = 0;
	
	private static final String[] produttori = {"Dell", "HP", "Apple", "Lenovo", "Acer", "Asus", "Samsung"};

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
	
	public static Computer randomica() {
		Random random = new Random();
		double prezzo = 500 + (2000 - 500) * random.nextDouble();
		double peso = 0.7 +(5.0 - 0.7) * random.nextDouble();
		double larghezza = 30 +(50 - 30) * random.nextDouble();
		double altezza = 20 +(30 - 20) * random.nextDouble();
		double profondita = 1 +(5 - 1) * random.nextDouble();
		String produttore = produttori[random.nextInt(produttori.length)];
		int annoDiProduzione = 2015 + random.nextInt(10);
		return new Computer(prezzo, peso, larghezza, altezza, profondita, produttore, annoDiProduzione);
	}

	public void stampaDati() {
		String rigaCornice = "+-----------------------------------------------+";
		String format = "| %-15s: %-25s |\n";
		
		System.out.println(rigaCornice);
		System.out.printf(format,"Produttore",produttore);
		System.out.printf(format,"Prezzo",String.format("%.2f €",prezzo));
		System.out.printf(format,"Peso",String.format("%.2f kg", peso));
		System.out.printf(format,"Larghezza",String.format("%.2f cm",larghezza));
		System.out.printf(format,"Altezza",String.format("%.2f cm", altezza));
		System.out.printf(format,"Profondità",String.format("%.2f cm", profondita));
		System.out.printf(format,"Anno produzione",annoDiProduzione);
		System.out.println(rigaCornice);
    }

}
