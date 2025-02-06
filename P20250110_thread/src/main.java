
public class main {

	public static void main(String[] args) {
		thread1 t1 = new thread1();
		t1.start();
	
	
		Thread t2 = new Thread(new Thread2());
		t2.start();
	}

}
