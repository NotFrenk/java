
public class Abbigliamento extends Prodotto{

	public Abbigliamento() {
		super();
	}
	
	

	public Abbigliamento(String name, Double price, String categoria) {
		super(name, price, categoria);
	}



	@Override
	public Double CalculateDiscount() {
		if (this.getCategoria()=="Abbigliamento invernale") {
			return getPrice() * 0.15;
		}
		return 0.0;
	}

}
