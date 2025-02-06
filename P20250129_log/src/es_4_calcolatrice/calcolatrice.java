package es_4_calcolatrice;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Costruire una classe calcolatrice con 4 metodi somma, sottrazione, divisione e moltiplicazione e inserire i log nei vari metodi con le varie priorità.
 */

public class calcolatrice {

	public static void main(String[] args) {
		calcolatrice calcolatrice = new calcolatrice();
        calcolatrice.somma(10, 5);
        calcolatrice.sottrazione(10, 5);
        calcolatrice.moltiplicazione(10, 5);
        try {
            calcolatrice.divisione(10, 0);
        } catch (ArithmeticException e) {
            logger.log(Level.WARNING, "Eccezione catturata: {0}", e.getMessage());
        }

	}
	
	private static final Logger logger = Logger.getLogger(calcolatrice.class.getName());
	

    public double somma(double a, double b) {
        double risultato = a + b;
        logger.log(Level.INFO, "Somma: {0} + {1} = {2}", new Object[]{a, b, risultato});
        return risultato;
    }

    public double sottrazione(double a, double b) {
        double risultato = a - b;
        logger.log(Level.INFO, "Sottrazione: {0} - {1} = {2}", new Object[]{a, b, risultato});
        return risultato;
    }

    public double moltiplicazione(double a, double b) {
        double risultato = a * b;
        logger.log(Level.INFO, "Moltiplicazione: {0} * {1} = {2}", new Object[]{a, b, risultato});
        return risultato;
    }

    public double divisione(double a, double b) {
        if (b == 0) {
            logger.log(Level.SEVERE, "Errore: divisione per zero");
            throw new ArithmeticException("Impossibile dividere per zero");
        }
        double risultato = a / b;
        logger.log(Level.INFO, "Divisione: {0} / {1} = {2}", new Object[]{a, b, risultato});
        return risultato;
    }
}
