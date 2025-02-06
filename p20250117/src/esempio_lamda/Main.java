package esempio_lamda;

import java.lang.Thread;
public class Main {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("Ecco un thread creato senza Espressioni Lambda");
			}
		};
		Thread t2 = new Thread(()-> System.out.println("Thread creato con le Espressioni Lambda"));
		t1.start();
		t2.start();
	}
}
