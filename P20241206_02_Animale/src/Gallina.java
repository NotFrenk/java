
public class Gallina extends AnimaleTerrestre{
	private int uovaDeposte;
	
	public Gallina(String genere, int zampe, String nome, Double peso, int uovaDeposte) {
		super(genere, zampe, nome);

		this.uovaDeposte = uovaDeposte;
	}

	public int getUovaDeposte() {
		return uovaDeposte;
	}

	public void setUovaDeposte(int uovaDeposte) {
		this.uovaDeposte = uovaDeposte;
	}

	
	@Override
	public String toString() {
		return "Gallina [uovaDeposte=" + uovaDeposte + ", toString()=" + super.toString() + "]";
	}

	public String Verso() {
		return "La gallina fa chicchirichi";
	}
	
}
