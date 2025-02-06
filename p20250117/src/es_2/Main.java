package es_2;

public class Main {

	public static void main(String[] args) {
		VerificatoreParola p1 = (parola, lunghezza) -> {
			if (parola.length()>lunghezza) {
				return true;
			} else {
				return false;
			}
		};
	System.out.println(p1.verifica("salve", 10));	
		
	}
}
