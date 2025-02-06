package src;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
	
	// I TIPI GENERICS	

	public static void main(String[] args) {
		// Definire una classe (CoppiaInt) che contiene due Integer
		
		Coppia<Integer, Double> ci1 = new Coppia<Integer,Double>(1, 2.0);
		Coppia<Integer, Double> ci2 = new Coppia<Integer,Double>(111, 112.0);
		
		// implementeare un metodo swapCoppia che scambia tra loro i contenuti di 
		// due coppie di dati (es: in ci2 va 1, 2.0 e in ci1 va 111, 112.0
		
		System.out.println(ci1 + ", " + ci2);
		
		SwapCoppia(ci1, ci2);
		
		System.out.println(ci1 + ", " + ci2);
		System.out.println();
		
		
		// ORA CON LE STRINGWE 
		
		Coppia<String, String> css1 = new Coppia<String, String> ("uno", "due");
		Coppia<String, String> css2 = new Coppia<String, String> ("AAAuno", "BBBdue");
		
		System.out.println(css1+ ", " + css2);
		
		SwapCoppiaString(css1, css2);
		
		System.out.println(css1+ ", " + css2);
		System.out.println();
		
		
		//scrivere un metodo Swap che scambi i valore di a e b 
		int a=10;
		int b=20;
		// non si puo fare perche non si possono scambiare due valori primitivi
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.addAll(Arrays.asList(new Integer[] {3,4,5,6,7,8}));
		//scambiare con un metodo swap i valori dal posto 3 al posto 5 della lista 
		System.out.println(li);
		
		SwapValoriIn(li, 3, 5);
		System.out.println(li);
		
		
	}

	private static void SwapCoppia(Coppia<Integer, Double> ci1, Coppia<Integer, Double> ci2) {
		// TODO Auto-generated method stub
		Coppia<Integer, Double> appo = new Coppia<Integer, Double>(ci1.getPrimo(), ci1.getSecondo());
		
		ci1.setPrimo(ci2.getPrimo());
		ci1.setSecondo(ci2.getSecondo());
		
		ci2.setPrimo(appo.getPrimo());
		ci2.setSecondo(appo.getSecondo());
	}
	
	private static <T1, T2> void SwapCoppiaString(Coppia<T1, T2> ci1, Coppia<T1, T2> ci2) {
		// TODO Auto-generated method stub
		Coppia<T1, T2> appo = new Coppia<T1, T2>(ci1.getPrimo(), ci1.getSecondo());
		
		ci1.setPrimo(ci2.getPrimo());
		ci1.setSecondo(ci2.getSecondo());
		
		ci2.setPrimo(appo.getPrimo());
		ci2.setSecondo(appo.getSecondo());
	}
	
	private static void SwapValoriIn(LinkedList<Integer> li, int i , int j) {
		Integer appo = li.get(i);
		li.set(i, li.get(j));
		li.set(j, appo);
	}
	
}
