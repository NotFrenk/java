package es_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CalcolatoreArea a1 = (raggio) -> (raggio*raggio)*Math.PI;
		System.out.println("Inserisci la lunghezza del raggio");
		Scanner s = new Scanner(System.in);
		int r = Integer.parseInt(s.nextLine());
		System.out.printf("L'area del cerchio di raggio -"+r+"- è uguale a: " + a1.calcola(r));

	}

}
