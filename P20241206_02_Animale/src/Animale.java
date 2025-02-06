
public abstract class Animale {
	
	private String genere;
	
	public Animale(String genere) {
		super();
		this.genere = genere;
	}



	public String getGenere() {
		return genere;
	}



	public void setGenere(String genere) {
		this.genere = genere;
	}



	public abstract String Verso();

}
