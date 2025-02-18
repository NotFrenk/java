package com.spring.report.utility;

import java.util.ArrayList;
import java.util.List;

import com.spring.report.dto.prodottoDTO;
import com.spring.report.entity.prodotto;

public class calcoliReport {

	public static List<String> getDescrizioni(List<prodotto> prodotti) {

		List<String> descrizione = new ArrayList<>();

		for (prodotto p : prodotti) {
			descrizione.add(p.getDescrizione());
		}
		return descrizione;
	}

	public static int sumQuantita(List<prodotto> lp) {

		int somma = 0;

		for (prodotto p : lp) {
			somma += p.getQuantia();
		}
		return somma;
	}

	public static int numProdNonDisp(List<prodotto> lp) {
		int n_prodNonDispo = 0;
		for (prodotto p : lp) {
			if (p.getQuantia() == 0)
				n_prodNonDispo += 1;
		}
		return n_prodNonDispo;
	}

	public static double mediaPrezzi(List<prodotto> lp) {

		double prezzo = 0;
		double media = 0;
		int n_prod = 0;

		for (prodotto p : lp) {
			prezzo += p.getPrezzo_cons();
			n_prod += 1;
		}
		return media = prezzo / n_prod;
	}

	public static List<String> listaProdNonDisp(List<prodotto> lp) {

		List<String> nomi = new ArrayList<String>();

		for (prodotto p : lp) {
			if (p.getQuantia() == 0)
				nomi.add(p.getModello());
		}
		return nomi;
	}

}
