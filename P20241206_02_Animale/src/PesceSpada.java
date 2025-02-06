public class PesceSpada extends AnimaleAcquatico{
	private double lunghezzaSpada;

	public PesceSpada(String genere, int pinne, String nome, double lunghezzaSpada) {
		super(genere, pinne, nome);
		this.lunghezzaSpada = lunghezzaSpada;
	}

	public double getLunghezzaSpada() {
		return lunghezzaSpada;
	}

	public void setLunghezzaSpada(double lunghezzaSpada) {
		this.lunghezzaSpada = lunghezzaSpada;
	}

	@Override
	public String toString() {
		return "PesceSpada [lunghezzaSpada=" + lunghezzaSpada + ", toString()=" + super.toString() + "]";
	}
	
	public String Verso() {
		return "Il Pesce Spada non emette versi.";
	}
}

