
public class triangolo_rettangolo {
	//devo dichiarare attributi/variabili e metodi/funzioni
	private double cat1;
	private double cat2; 
	private double ipo;
	private double area;
	private double perimetro;
	
	
	public double getCat1() {
		return cat1;
	}
	
	public void setCat1(double cat1) {
		this.cat1 = cat1;
		UpdateFuncionalRelations();
	}
	
	private void UpdateFuncionalRelations() {
		ipo=Math.sqrt(cat2*cat2+cat1*cat1);
		area = cat1*cat2/2.;
		perimetro = cat1+cat2+ipo;
	}
	
	public double getCat2() {
		return cat2;
	}
	public void setCat2(double cat2) {
		this.cat2 = cat2;
		UpdateFuncionalRelations();
	}
	public double getIpo() {
		return ipo;
	}
	
	public 
	
	public triangolo_rettangolo(double cat1, double cat2) {
		super();
		this.cat1 = cat1;
		this.cat2 = cat2;
		
		ipo = Math.sqrt(cat2*cat2+cat1*cat1);
		area = 
		perimetro = 
		
	}
	
	

}
