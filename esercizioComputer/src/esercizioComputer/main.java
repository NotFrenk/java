package esercizioComputer;

public class main {

	public static void main(String[] args) {
		/*
		 * a partire dalla classe computer
		 * generare 10 computer inserendo dei valori casuali nei campi interi e double
		 * per ogni computer stampare (modifica della toString oppure tramite un metodo ad hoc) 
		 * in un formato allineato e ben leggibile, possibilmente con una cornice esterna 
		 * (sopra, sotto e a fianco del testo)
		 *
		 */

		
		
		
		
		Computer[] computers = new Computer[10];
		
		// generare 10 computer casuali 
		for (int i = 0; i < computers.length; i++){
			computers[i] = Computer.randomica();
		}
			
		for (Computer computer : computers) {
			computer.stampaDati();
			System.out.println();
		}
			
		System.out.println("Numero di computer creati: " + Computer.getNumeroDiComputerCreati());
	}

}
