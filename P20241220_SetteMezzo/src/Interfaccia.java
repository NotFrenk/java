import java.util.Scanner;

public class Interfaccia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean giocaAncora = true;

		while (giocaAncora) {
			Mazzo mazzo = new Mazzo();
			mazzo.mischia();

			Giocatore giocatore1 = new Giocatore("Giocatore 1");
			Giocatore banco = new Giocatore("Banco");

			giocatore1.aggiungiCarta(mazzo.pescaCarta());
			banco.aggiungiCarta(mazzo.pescaCarta());

			Giocatore giocatoreCorrente = giocatore1;
			while (true) {
				System.out.println(giocatoreCorrente.getNome() + ", le tue carte: " + giocatoreCorrente.getMano());
				System.out.println("Punteggio: " + giocatoreCorrente.getPunteggio());
				System.out.println("le carte del " + banco.getNome() + " sono: " + banco.mostraMano());
				System.out.println("Punteggio: " + banco.getPunteggio());
				
				

				if (giocatoreCorrente.haSballato()) {
					System.out.println(giocatoreCorrente.getNome() + " ha sballato!");
					break;
				}

				// Chiedi al giocatore se vuole chiedere una carta o stare
				System.out.println("Vuoi chiedere una carta? (si/no)");
				String risposta = scanner.nextLine().toLowerCase();
				if (risposta.equals("si")) {
					if (mazzo.carteRimaste() > 0) {
						giocatoreCorrente.aggiungiCarta(mazzo.pescaCarta());
					} else {
						System.out.println("Non ci sono più carte nel mazzo!");
						break;
					}
				} else {
					System.out.println(giocatoreCorrente.getNome() + " ha deciso di stare.");
					break;
				}

				// Passa il turno all'altro giocatore
				giocatoreCorrente = (giocatoreCorrente == giocatore1) ? banco : giocatore1;
			}

			// Determina il vincitore
			if (giocatore1.haSballato()) {
				System.out.println(banco.getNome() + " ha vinto!");
			} else if (banco.haSballato()) {
				System.out.println(giocatore1.getNome() + " ha vinto!");
			} else if (giocatore1.getPunteggio() > banco.getPunteggio()) {
				System.out.println(giocatore1.getNome() + " ha vinto!");
			} else if (banco.getPunteggio() > giocatore1.getPunteggio()) {
				System.out.println(banco.getNome() + " ha vinto!");
			} else {
				System.out.println("Pareggio!");
			}

			// Chiedi se il giocatore vuole rigiocare
			System.out.println("Vuoi rigiocare? (si/no)");
			String rispostaRigiocare = scanner.nextLine().toLowerCase();
			if (!rispostaRigiocare.equals("si")) {
				giocaAncora = false; // Esci dal ciclo se non si vuole rigiocare
			}
		}

		scanner.close();
		System.out.println("Grazie per aver giocato!");
	}

}
