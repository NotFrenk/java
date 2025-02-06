public class Coccodrillo extends AnimaleAcquatico{
	private double forzaMorso; //in Newton

	public Coccodrillo(String genere, int pinne, String nome, double forzaMorso) {
		super(genere, pinne, nome);
		this.forzaMorso = forzaMorso;
	}

	public double getForzaMorso() {
		return forzaMorso;
	}

	public void setForzaMorso(double forzaMorso) {
		this.forzaMorso = forzaMorso;
	}

	@Override
	public String toString() {
		return "Coccodrillo [forzaMorso=" + forzaMorso + ", toString()=" + super.toString() + "]";
	}
	
	public String Verso() {
		return "Il Coccodrillo ruggisce.";
	}
}