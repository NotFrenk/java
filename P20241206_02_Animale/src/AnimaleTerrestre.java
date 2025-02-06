
public class AnimaleTerrestre extends Animale {
	
	private int zampe;
	private String nome;	
	

	public AnimaleTerrestre(String genere, int zampe, String nome) {
		super(genere);
		this.zampe = zampe;
		this.nome = nome;
	}
	
	

	public int getZampe() {
		return zampe;
	}



	public void setZampe(int zampe) {
		this.zampe = zampe;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
	
	


	@Override
	public String toString() {
		return "AnimaleTerrestre [zampe=" + zampe + ", nome=" + nome + "]";
	}



	@Override
	public String Verso() {
		return "Animale Terrestre: Nome = " + nome + ", Zampe = " +zampe+ ", Genere = "+getGenere();
	}
	
	

}
