public class Tricheco extends AnimaleAcquatico{
	private double lunghezzaZanne;

	public Tricheco(String genere, int pinne, String nome, double lunghezzaZanne) {
		super(genere, pinne, nome);
		this.lunghezzaZanne = lunghezzaZanne;
	}

	public double getLunghezzaZanne() {
		return lunghezzaZanne;
	}

	public void setLunghezzaZanne(double lunghezzaZanne) {
		this.lunghezzaZanne = lunghezzaZanne;
	}

	@Override
	public String toString() {
		return "Tricheco [lunghezzaZanne=" + lunghezzaZanne + ", toString()=" + super.toString() + "]";
	}
	
	public String Verso() {
		return "Il Tricheco grugnisce."; 
	}
}
