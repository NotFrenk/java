
public class Thread7 implements Runnable{
	
	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
        System.out.println("Nome del thread: " + currentThread.getName());
        System.out.println("Stato del thread: " + currentThread.getState());	
	}
	
	public static void main(String[] args) {
		Thread7 task1 = new Thread7();
		Thread7 task2 = new Thread7();
		
		Thread thread1 = new Thread(task1, "Thread-1");
		Thread thread2 = new Thread(task2, "Thread-2");
		
		System.out.println(thread1.getName() + " - Stato prima di startare: " + thread1.getState());
		System.out.println(thread2.getName() + " - Stato prima di startare: " + thread2.getState());
		
		thread1.start();
		thread2.start();
		
		System.out.println(thread1.getName() + " - Stato dopo di startare: " + thread1.getState());
		System.out.println(thread2.getName() + " - Stato dopo di startare: " + thread2.getState());
		
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stampa lo stato dei thread dopo la fine
        System.out.println(thread1.getName() + " - Stato dopo fine: " + thread1.getState());
        System.out.println(thread2.getName() + " - Stato dopo fine: " + thread2.getState());

	}



}
