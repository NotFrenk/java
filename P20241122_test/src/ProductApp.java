
public class ProductApp {

	public static void main(String[] args) {
		
		ProductManager manager = new ProductManager();
		
		Prodotto smartphone = new Elettronica("Smartphone", 800.0, "Elettronica");
        Prodotto laptop = new Elettronica("Laptop", 1500.0, "Elettronica");
        Prodotto giaccaInvernale = new Abbigliamento("Giacca Invernale", 120.0, "Abbigliamento invernale");
        Prodotto tshirtEstiva = new Abbigliamento("T-shirt Estiva", 25.0, "Abbigliamento estivo");
        
        
        manager.addProduct(smartphone);
        manager.addProduct(laptop);
        manager.addProduct(giaccaInvernale);
        manager.addProduct(tshirtEstiva);
        
        // visualizza prima di ordinare
        System.out.println("PRODOTTI NON ORDINATI");
        manager.vedoProdotti();
        
        
        // ordina per prezzo crescente
        manager.sortProductsByPrice();
        
        
        // visualizza lista ordinata
        System.out.println("PRODOTTI ORDINATI PER PREZZO");
        manager.vedoProdotti();
        
	}

}
