
public class Leone extends AnimaleTerrestre{
	private double peso;
	private double velocita;
	
	public Leone(String genere, int zampe, String nome, double peso, double velocita) {
		super(genere, zampe, nome);
		this.peso = peso;
		this.velocita = velocita;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVelocita() {
		return velocita;
	}

	public void setVelocita(double velocita) {
		this.velocita = velocita;
	}
	
	

    @Override
	public String toString() {
		return "Leone [peso=" + peso + ", velocita=" + velocita + ", toString()=" + super.toString() + "]";
	}

	@Override
    public String Verso() {
        return "Il Leone ruggisce.";
    }

}
