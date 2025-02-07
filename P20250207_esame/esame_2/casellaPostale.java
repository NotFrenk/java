import java.util.LinkedList;
import java.util.Queue;

public class casellaPostale {
	private final int MAX_CAPACITA = 10;
	private Queue<String> messaggi = new LinkedList<>();
	
	public synchronized void scriviMessaggio(String messaggio) throws InterruptedException {
		while(messaggi.size() == MAX_CAPACITA) {
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
	
}
