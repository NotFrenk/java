
public class thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println("io sono " + thread1.class.getSimpleName() + " ed \"i\" vale " + i);
		}
	}
}
