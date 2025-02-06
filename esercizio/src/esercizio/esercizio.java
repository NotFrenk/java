package esercizio;

public class esercizio {

	public static void main(String[] args) {
		/*
		 * Realizare una classe Computer con i seguenti attributi
		 * -prezzo
		 * -peso
		 * -dimensioni (larghezza, altezza, profondita)
		 * -produttore
		 * -anno di produzione
		 * 
		 * nel main creare degli oggetti di tipo comoputer e stampare il loro contenuto 
		 * 
		 * NB: ricordate di utilizzare getter e costruttore generati da eclipse
		 * 
		 * BONUS: aggiungere un metodo alla classe computer che stampi quanti oggetti(di tipo computer) sono stati creati
		 */
		Computer computer1 = new Computer(1200.0, 2.5, 35.0, 2.0, 24.0, "Dell", 2023);
		Computer computer2 = new Computer(1500.0, 2.3, 32.0, 1.9, 22.0, "Apple", 2024);
		
		computer1.stampaDati();
		computer2.stampaDati();
		
		System.out.println("\nNumero di computer creati: " + Computer.getNumeroDiComputerCreati()); 
	}

}
