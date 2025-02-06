
public class teorema_di_pitagora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Dato un triangolo rettangolo i cui cateti misurano rispettivamente 45.3 e 67.2 metri,
		 * 1) calcolare e stampare la lunghezza dell'ipotenusa
		 * 2) calcolare e stampare la sua area
		 * 3) calcolare e stampare il suo perimetro
		 * Infine stampare circonferenza e area di u cerchio di raggio pari ai 3/4 dell'ipotenusa.
		 */
		
		double c1 = 45.3;
		double c2 = 67.2;
		
		// CALCOLIAMO L'IPOTENUSA
		double ip = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
		System.out.printf("il valore dellipotenusa è: %.2f metri%n", ip );
		
		// CALCOLIAMO L'AREA 
		double a = (c1 * c2)/2;
		System.out.printf("L'area del triangolo è: %.2f metri quadrati%n", a);
		
		// CALCOLIAMO IL PERIMETRO 
		double p = c1 + c2 + ip;
		System.out.printf("il perimetro è: %.2f metri%n", p);
		
		// STAMPARE CIRCONFERENZA E AREA DI UN CERCHIO
		double r = (3.0 / 4.0) * ip;
		double c = 2 * Math.PI * r;
		double aCerchio = Math.PI * Math.pow(r, 2);
		System.out.printf("La circonferenza del cerchio è: %.2f metri%n", c);
	    System.out.printf("L'area del cerchio è: %.2f metri quadrati%n", aCerchio);
	    
	    
	    triangolo_rettangolo tr = new triangolo_rettangolo(3,4);
	    System.out.println("ipotenusa: " +tr.getIpo());
	    System.out.println("area: "+ tr.getarea());
	    
	    
	}

}
