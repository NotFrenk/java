public class TestCasellaPosta {
    public static void main(String[] args) {
        casellaPostale casella = new casellaPostale();
        ScrittoreMessaggi scrittore = new ScrittoreMessaggi(casella);
        LettoreMessaggi lettore = new LettoreMessaggi(casella);

        scrittore.start();
        lettore.start();
    }
}