
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Random;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[]args) {
		new Filatrice(1).start();
		new Filatrice(2).start();
	}

}

class Produzione {
	public String prodotto;
	public int metraggio;

	public Produzione(String prodotto, int metraggio) {
		super();
		this.prodotto = prodotto;
		this.metraggio = metraggio;
	}

	public Produzione() {
		super();
	}
}

public static BufferedWriter OpenFileForAppend(String nomeFile) {
	try {
		Path path = Path.of(nomeFile);
		BufferedWriter writer = Files.newBufferedWriter(path,
				Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
		return writer;
	} catch (Exception ex) {
		return null;
	}
}
