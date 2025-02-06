import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;

public class es_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Scrivi |EXIT| per chiudere il programma");
			System.out.println("Inserisci il numero e io ti dirò se è PARI o DISPARI");
			
			String input = scanner.nextLine();

			if (input.equalsIgnoreCase("EXIT")) {
				System.out.println("cia cia");
				scanner.close();
				break;	
			} 
			
			try {
				int numero = Integer.parseInt(input);
				
				if (numero % 2 == 0) {
					
					System.out.println("Il numero :" + numero + " è pari.");
					
				} else {
					
					System.out.println("Il numero :" + numero + " è dispari.");
				}
			}catch (NumberFormatException e) {
				System.out.println("Devi inserire un numero valido");
			}

			
		}
	}
}
