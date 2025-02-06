
public class AnimaleAcquatico extends Animale{
	private int pinne;
	private String nome;
	
	

	public AnimaleAcquatico(String genere, int pinne, String nome) {
		super(genere);
		this.pinne = pinne;
		this.nome = nome;
	}

	public int getPinne() {
		return pinne;
	}

	public void setPinne(int pinne) {
		this.pinne = pinne;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "AnimaleAcquatico [pinne=" + pinne + ", nome=" + nome + "]";
	}

	@Override
	public String Verso() {
		return "Animale Acquatico: Nome = " + nome + ", Pinne = " +pinne+ ", Genere = "+getGenere();
	}
	
}
