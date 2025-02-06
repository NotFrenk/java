
public class main {

	public static void main(String[] args) {
		/*
		 * for i in range (0,10)
		 * 	  print(i)
		 */
		
		
		/*
		 * per il for: tre elementi separati da " ; "
		 * 	 primo: dichiarazione e inizializzazione della variabile di ciclo
		 * 	 secondo: condizione di permanenza nel ciclo
		 * 	 terzo: incremento della cariavile di ciclo da fare come ultima istruzione del ciclo
		 */
//		for (int i=0; i<10; i++) {
//			System.out.println(i);
//		}
//		
//		for (;;) {
//			System.out.println("Ciao"); 
//		}
//		
//		int i1=20;
//		for (; i1<25; i1 +=10) {
//			System.out.println(i1);
//		}
		
		
		
//		for (int i=0; i<10; i++) {
//		double d=Math.random();
//		System.out.println(d);
//		}
		
//		for (int i=0; i<10; i++) {
//			double d=Math.random();
//			System.out.println(d);
//			System.out.println(" ");
//		}
//		System.out.println();
		
		for (int i=0; i<10; i++) {
		double d=Math.random();
		System.out.println(((i<9)?" ":"") + (i+1) + ") " + d);
		}
		
	}
}
