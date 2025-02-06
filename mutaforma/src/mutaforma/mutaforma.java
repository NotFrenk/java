package mutaforma;

public class mutaforma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = somma (10,20);
		System.out.println(a);
		
		double b = somma (10.1, 20.0);
		
		String c = somma ("buona", "sera");
	}

	private static String somma(String string, String string2) {
		// TODO Auto-generated method stub
		return string+string2;
	}

	private static double somma(double d, double e) {
		// TODO Auto-generated method stub
		return d+e;
	}

	private static int somma(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
		
	}

}
