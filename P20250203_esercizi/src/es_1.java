import java.util.Scanner;

public class es_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.println("Inserisci il primo numero: ");
		double numero1 = scanner.nextDouble();
		
		System.out.println("Inserisci il secondo numero: ");
		double numero2 = scanner.nextDouble();
		
		double somma = numero1 + numero2;
		
		System.out.println("La somma dei due numeri è: " + somma);
		
		scanner.close();
		
		

	}
}
