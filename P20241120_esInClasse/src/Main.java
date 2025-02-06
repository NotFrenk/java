import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.*;

public class Main {

	public static void main(String[] args) {
        /*
         * Definire la classe astratta Automezzo con attributi
         * - numero di ruote
         * - carburante
         * e con il metodo astratto getMaxSpeed()
         * Definire due classi figlie di Automezzo: Motociclo e Autovettura
         * che aggiungono gli attributi cilindrata e consumo
         * 1) Creare una lista di Motociclo e una lista di Autovettura
         * 2) inserire almeno 10 elementi per lista
         * 3) Stampare le liste ordinate (per velocità e poi per consumo)
         * 4) Costruire una nuova lista che contiene contemporaneamente Motocicli e Autovetture
         * 6) Stampare la nuova lista ordinata (per velocità e poi per consumo)
         */
		
		// Creazione della lista di Autovetture
		List<Autovettura> autovetture = new ArrayList<>();
		autovetture.add(new Autovettura(4, "Diesel", 1600, 7.2, 190));
		autovetture.add(new Autovettura(4, "Benzina", 2000, 8.0, 220));
		autovetture.add(new Autovettura(4, "GPL", 1200, 6.5, 170));
		autovetture.add(new Autovettura(4, "Diesel", 1400, 6.0, 180));
		autovetture.add(new Autovettura(4, "Benzina", 1800, 7.8, 200));
		autovetture.add(new Autovettura(4, "Metano", 1000, 5.5, 150));
		autovetture.add(new Autovettura(4, "Benzina", 1500, 6.8, 185));
		autovetture.add(new Autovettura(4, "Elettrico", 2500, 9.0, 240));
		autovetture.add(new Autovettura(4, "Diesel", 3000, 10.5, 260));
		autovetture.add(new Autovettura(4, "GPL", 1300, 5.8, 160));
		
		System.out.println(autovetture);
		
		Collections.sort(autovetture);
		System.out.println("\n AUTOVETTURA ORDINATA \n");
		System.out.println(autovetture);

		// Creazione della lista di Motocicli
		List<Motociclo> motocicli = new ArrayList<>();
		motocicli.add(new Motociclo(2, "Benzina", 600, 5.5, 200));
		motocicli.add(new Motociclo(2, "Benzina", 750, 4.8, 220));
		motocicli.add(new Motociclo(2, "Diesel", 1000, 6.2, 250));
		motocicli.add(new Motociclo(2, "GPL", 125, 3.0, 100));
		motocicli.add(new Motociclo(2, "Benzina", 500, 4.5, 180));
		motocicli.add(new Motociclo(2, "Metano", 250, 3.2, 120));
		motocicli.add(new Motociclo(2, "Diesel", 900, 5.8, 230));
		motocicli.add(new Motociclo(2, "Elettrico", 850, 5.1, 210));
		motocicli.add(new Motociclo(2, "GPL", 300, 3.5, 140));
		motocicli.add(new Motociclo(2, "Benzina", 1100, 6.5, 270));
        
        System.out.println(motocicli);
        
		Collections.sort(motocicli);
		System.out.println("\n MOTOCICLI ORDINATA \n");
		System.out.println(motocicli);
	}

}
