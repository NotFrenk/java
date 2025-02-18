package esame;

import java.util.List;

class TestNegozio {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Mario", "Rossi", "mario.rossi@example.com", "password123");
        Cliente cliente2 = new Cliente(2, "Laura", "Bianchi", "laura.bianchi@example.com", "password456");

        Prodotto smartphone = new Smartphone(101, "iPhone", 999.99, "Smartphone Apple", List.of("Negozio A", "Negozio B"), "iOS", 128);
        Prodotto televisore = new Televisore(102, "Samsung TV", 599.99, "Smart TV 4K", List.of("Negozio A", "Negozio C"), 55, true);

        cliente1.acquistaProdotto(smartphone);
        cliente2.acquistaProdotto(televisore);

        cliente1.stampaProdottiAcqustati();
        cliente2.stampaProdottiAcqustati();
    }
}
