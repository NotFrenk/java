public class Autovettura extends Automezzo implements Comparable<Autovettura> {
    private Integer cilindrata; 
    private Double consumo;     
    private Integer maxspeed;   

    public Autovettura(Integer n_ruote, String carburante, Integer cilindrata, Double consumo, Integer maxspeed) {
        super(n_ruote, carburante);
        this.cilindrata = cilindrata;
        this.consumo = consumo;
        this.maxspeed = maxspeed;
    }

    public Integer getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(Integer cilindrata) {
        this.cilindrata = cilindrata;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    public Integer getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(Integer maxspeed) {
        this.maxspeed = maxspeed;
    }

    @Override
    public String toString() {
        return "Autovettura ---> cilindrata= " + cilindrata + ", consumo= " + consumo + ", maxspeed= " + maxspeed
                + " " +  super.toString() + "\n";
    }

    @Override
    public int getMaxSpeed() {
        return maxspeed;
    }

    @Override
    public int compareTo(Autovettura o) {
        int v=getMaxSpeed()-o.getMaxSpeed();
        if (v != 0) {
        	return v;
        }
        return getConsumo().compareTo(o.getConsumo());
    }
}
