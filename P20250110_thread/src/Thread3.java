
public class Thread3 implements Runnable{
	public void run() {
		for (int i=0; i < 6; i++) {
			System.out.println(this.hashCode()+" " + i);
		}
			
		
	}
	


	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread3());
		Thread t2 = new Thread(new Thread3());
		
		t1.start();
		t2.start();
		
	}

}

