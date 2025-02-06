import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crea la lista di animali (zoo)
        List<Animale> zoo = new ArrayList<>();

        // Creazione degli animali
        Leone leone = new Leone("Mammifero", 4, "Leone", 190.5, 80.0);
        Gallina gallina = new Gallina("Mammifero", 2, "Gallina", 1.5, 10);
        Tricheco tricheco = new Tricheco("Rettile", 4, "Tricheco", 70.5);
        Delfino delfino = new Delfino("Mammifero", 2, "Delfino", 3.5);
        PesceSpada pesceSpada = new PesceSpada("Pesce", 2, "Pesce Spada", 30.0);
        Coccodrillo coccodrillo = new Coccodrillo("Rettile", 0, "Coccodrillo", 5000.0);

        // Aggiungi gli animali al "zoo"
        zoo.add(leone);
        zoo.add(gallina);
        zoo.add(tricheco);
        zoo.add(delfino);
        zoo.add(pesceSpada);
        zoo.add(coccodrillo);

        // Visualizza gli animali
        System.out.println("--- Visualizzazione degli animali ---");
        visualizzaAnimali(zoo);

        // Salva gli animali su file (JSON)
        salvaSuFile(zoo);

        // Carica gli animali dal file e visualizzali
        System.out.println("--- Caricamento degli animali dal file ---");
        caricaDaFile(zoo);
        visualizzaAnimali(zoo);
    }

    // Funzione per visualizzare gli animali
    public static void visualizzaAnimali(List<Animale> zoo) {
        for (Animale animale : zoo) {
            System.out.println(animale);
        }
    }

    // Funzione per salvare la lista di animali in un file (simulato come una stampa)
    public static void salvaSuFile(List<Animale> zoo) {
        System.out.println("\n--- Salvataggio degli animali su file (JSON) ---");
        // Qui salviamo su file (simuliamo la scrittura su file con una stampa)
        // In un'applicazione reale, puoi usare JSON per scrivere su un file
        // Ad esempio con una libreria come Jackson o Gson.
        for (Animale animale : zoo) {
            System.out.println("Salvando: " + animale);
        }
    }

    // Funzione per caricare gli animali dal file (simulato come una stampa)
    public static void caricaDaFile(List<Animale> zoo) {
        System.out.println("\n--- Caricamento degli animali da file (JSON) ---");
        // Simuliamo il caricamento degli animali dal file
        // Ad esempio, in una vera applicazione, dovresti leggere da un file JSON.
        // Qui riaggiungiamo gli stessi animali come esempio.
        zoo.clear(); // Pulisce la lista precedente
        zoo.add(new Leone("Mammifero", 4, "Leone", 190.5, 80.0));
        zoo.add(new Gallina("Mammifero", 2, "Gallina", 1.5, 10));
        zoo.add(new Tricheco("Rettile", 4, "Tricheco", 70.5));
        zoo.add(new Delfino("Mammifero", 2, "Delfino", 3.5));
        zoo.add(new PesceSpada("Pesce", 2, "Pesce Spada", 30.0));
        zoo.add(new Coccodrillo("Rettile", 0, "Coccodrillo", 5000.0));
    }
}