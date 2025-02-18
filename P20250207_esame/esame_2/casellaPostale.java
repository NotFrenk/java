import java.util.LinkedList;
import java.util.Queue;

public class casellaPostale {
	private Queue<String> messaggi = new LinkedList<>();
	
	public synchronized void scriviMessaggio(String messaggio) throws InterruptedException {
		while(messaggi.size() == 10) {
			wait();
		}
		messaggi.add(messaggio);
		System.out.println("Messaggio scritto " + messaggio);
		notifyAll();
	}
	
	public synchronized String leggiMessaggio() throws InterruptedException {
		while(messaggi.isEmpty()) {
			wait();
		}
		String messaggio = messaggi.poll();
		System.out.println("Messaggio letto " + messaggio);
		notifyAll();
		return messaggio;
	}
    public synchronized boolean isEmpty() {
        return messaggi.isEmpty();
    }
	
}
