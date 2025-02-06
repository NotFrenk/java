
public class Thread6 implements Runnable{

    @Override
    public void run() {
        // Ottieni il thread corrente
        Thread currentThread = Thread.currentThread();
        
        // Stampa il nome e lo stato del thread
        System.out.println("Nome iniziale del thread: " + currentThread.getName());
        System.out.println("Stato del thread: " + currentThread.getState());
        
        // Simula un'attività
        try {
            Thread.sleep(1000); // Pausa per 1 secondo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Stampa il nome del thread dopo la modifica
        System.out.println("Nome modificato del thread: " + currentThread.getName());
    }

    public static void main(String[] args) {
        // Creazione di due istanze Runnable
    	Thread6 task1 = new Thread6();
    	Thread6 task2 = new Thread6();

        // Creazione dei thread
        Thread thread1 = new Thread(task1, "Thread-1");
        Thread thread2 = new Thread(task2, "Thread-2");

        // Stampa lo stato dei thread prima di avviarli
        System.out.println(thread1.getName() + " - Stato prima di start: " + thread1.getState());
        System.out.println(thread2.getName() + " - Stato prima di start: " + thread2.getState());

        // Avvio dei thread
        thread1.start();
        thread2.start();

        // Modifica dei nomi dei thread
        thread1.setName("Modified-Thread-1");
        thread2.setName("Modified-Thread-2");

        // Stampa lo stato dopo aver avviato i thread
        System.out.println(thread1.getName() + " - Stato dopo start: " + thread1.getState());
        System.out.println(thread2.getName() + " - Stato dopo start: " + thread2.getState());

        // Aspetta che i thread finiscano
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stampa lo stato finale dei thread
        System.out.println(thread1.getName() + " - Stato finale: " + thread1.getState());
        System.out.println(thread2.getName() + " - Stato finale: " + thread2.getState());
    }
}
