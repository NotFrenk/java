
public class secondo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1° riga");
		System.out.println("2° riga");
		System.out.println("3° riga");
		System.out.println("4° riga");
		byte b1 = 10;
		byte b2;
		byte b3, b4, b5;
		
		System.out.println("il valore di b1 è: "+b1);
		b1 = 127;
		System.out.println("il valore di b1 è: "+b1);
		b1+=1;
		System.out.println("il valore di b1 è: "+b1);
		
		double d1=2.3;
		float f1 = 2.3F;
		
		//operatori arittmetici
		/*
		 * +,-,*,/,%,
		 * && (and)
		 * || (or)
		 * 
		 * Logica binaria
		 * & (and)
		 * | (or)
		 */
		
		/*Esercizio: definire le die variabili v1 e v2 di tipo intero
		 * Assegnte a v1 il valore 35 e a v2 il valore 41
		 * Stampate l' And logico tra v1 e v2
		 * Stampare l' and binario tra v1 e v2 
		 */
		int v1 = 35;
		int v2 = 41;
		//System.out.println(v1 && v2);
		System.out.println(v1 & v2);
		
		/*Altri operatori arittmetici:
		 * ++, -- ,+=, -=, *=, /=, &=, |=, ^=
		 * 
		 * confronto:
		 * <, >, ==, <=, >=,
		 * 
		 * operatori di shifting:
		 * >>, <<, <<=, >>=
		 */
	}

}
