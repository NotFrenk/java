class LettoreMessaggi extends Thread {
    private casellaPostale casella;

    public LettoreMessaggi(casellaPostale casella) {
        this.casella = casella;
    }

    @Override
    public void run() {
        try {
            while (true) {
                casella.leggiMessaggio();
                Thread.sleep(1000); // Simula il tempo necessario per leggere un messaggio
            }
        } catch (InterruptedException e) {
            System.out.println("Lettore interrotto.");
        }
    }
}