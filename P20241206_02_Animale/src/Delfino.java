public class Delfino extends AnimaleAcquatico{
	private double altezzaSalto;

	public Delfino(String genere, int pinne, String nome, double altezzaSalto) {
		super(genere, pinne, nome);
		this.altezzaSalto = altezzaSalto;
	}

	public double getAltezzaSalto() {
		return altezzaSalto;
	}

	public void setAltezzaSalto(double altezzaSalto) {
		this.altezzaSalto = altezzaSalto;
	}

	@Override
	public String toString() {
		return "Delfino [altezzaSalto=" + altezzaSalto + ", toString()=" + super.toString() + "]";
	}
	
	public String Verso() {
		return "Il Delfino fischia."; 
	}
}
