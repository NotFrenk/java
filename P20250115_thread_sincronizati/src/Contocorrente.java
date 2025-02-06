import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Contocorrente {
	private final String filePath;
	
	public Contocorrente(String filePath) {
		this.filePath = filePath;
	}

	public double Saldo() throws IOException {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(filePath));
			String saldoStr = br.readLine();
			return saldoStr != null ? Double.parseDouble(saldoStr) : 0.0;
		} finally {
			if (br != null) {
				br.close();
			}
		}
	}
	
	public void PrelievoNonSynch(double somma) throws Exception {
		BufferedWriter bw = null; 
		try {
			//legge il saldo attuale 
			double saldoAttuale = getSaldo();
			
		}
	}
	
	public synchronized void Prelievo (double somma) throws Exception{
		Thread.sleep(3000);
		
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {
			double nuovoSaldo = getSaldo() - somma;
		}
	}
	
}
