
public class Thread4_1 extends Thread{
	public void run() {
		for(int i = 0; i < 6; i++) {
			System.out.println(this.hashCode() + " " + i);
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
