	import java.util.*;

public class ProductManager {
	private List<Prodotto> productList;

	public ProductManager() {
		this.productList = new ArrayList<>();
	}
	
	// aggiungere prodotti
	public void addProduct(Prodotto product) {
		if (product != null) {
			productList.add(product);
		}
		else {
			System.out.println("il prodotto non può essere null");
		}
	}
	
	//vedere i prodotti
	public void vedoProdotti() {
		if (productList.isEmpty()) {
			System.out.println("La lista è vuota");
		}
		else {
			for (Prodotto product : productList) {
					System.out.println(product.toString()+"con sconto di: " + product.CalculateDiscount() );
			}
		}
	}
	// implementazione sorter by	
	public List<Prodotto>sortByPrice(List<Prodotto> products) {
		
		products.sort(Comparator.comparing(Prodotto::getPrice));
		return products;
	}
	
	public void sortProductsByPrice () {
		productList.sort(Comparator.comparing(Prodotto::getPrice));
	}
	
	
}
