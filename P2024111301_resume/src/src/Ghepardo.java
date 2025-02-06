package src;

public class Ghepardo extends Mammifero implements Must, Req, Comparable<Ghepardo>{

	@Override
	public String Verso() {
		return "Rugito";
	}
	
	//Costruttore vuoro
	public Ghepardo() {
		super();
	}

	//Costruttore pieno
	public Ghepardo(Integer freqResp, Integer freqCardio, Double speed) {
		super(freqResp, freqCardio);
		this.speed = speed;
	}
	
	//getter end setter
	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	//To string
	private Double speed;
	@Override
	public String toString() {
		return "Ghepardo [speed=" + speed + ", toString()=" + super.toString() + "]";
	}

	@Override
	public String GetClassName() {
		return "Ghepardo";
	}

	@Override
	public String GetVersion() {
		return "1.0";
	}

	@Override
	public String GetSerial() {
		return "AI48";
	}

	
	// compariamo il ghepardo corrente con il sucessivo
	@Override
	public int compareTo(Ghepardo o) {
		//posso compararlo cosi perche è un numero
		return speed.compareTo(o.speed); 
		
		// ordino cosi 
/**		Integer ret = speed.compareTo(o.speed);
		if (ret != 0) {
			return ret;
		} else {
			return getFreqCardio().compareTo(o.getFreqCardio());
		} */
	}
	
	
	
}
