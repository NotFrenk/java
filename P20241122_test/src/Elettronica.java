public class Elettronica extends Prodotto{

	
	
	public Elettronica() {
		super();
	}

	public Elettronica(String name, Double price, String categoria) {
		super(name, price, categoria);
	}

	@Override
	public Double CalculateDiscount() {
		if (getPrice() > 500) {
			return getPrice() * 0.10;
		}
		return 0.0;
	}

}
