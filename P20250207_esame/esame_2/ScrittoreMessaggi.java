class ScrittoreMessaggi extends Thread {
    private casellaPostale casella;
    private int contatore = 1;

    public ScrittoreMessaggi(casellaPostale casella) {
        this.casella = casella;
    }

    @Override
    public void run() {
        try {
            while (true) {
                casella.scriviMessaggio("Messaggio " + contatore);
                contatore++;
                Thread.sleep(500); // Simula il tempo necessario per scrivere un messaggio
            }
        } catch (InterruptedException e) {
            System.out.println("Scrittore interrotto.");
        }
    }
}