class ScrittoreMessaggi extends Thread {
	private casellaPostale casella;
	private int contatore = 1;
	private final int MAX_MESSAGGI = 10;

	public ScrittoreMessaggi(casellaPostale casella) {
		this.casella = casella;
		this.contatore = 1;
	}

	@Override
	public void run() {
		try {
			while (true) {
				for (int i = 0; i < MAX_MESSAGGI; i++) {
					casella.scriviMessaggio("Messaggio " + contatore);
					contatore++;
					Thread.sleep(500);
				}
				System.out.println("Scrittore in attesa che tutti i messaggi vengano letti...");

				synchronized (casella) {
					while (!casella.isEmpty()) {
						casella.wait();
					}
				}

				contatore = 1;
				System.out.println("Scrittore riprende a scrivere nuovi messaggi.");
			}
		} catch (InterruptedException e) {
			System.out.println("Scrittore interrotto.");
		}
	}
}