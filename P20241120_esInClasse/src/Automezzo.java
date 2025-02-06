public abstract class Automezzo {
    private Integer n_ruote;
    private String carburante; // Modificato da double a String

    public Automezzo() {
        super();
    }

    public Automezzo(Integer n_ruote, String carburante) {
        super();
        this.n_ruote = n_ruote;
        this.carburante = carburante;
    }

    public Integer getN_ruote() {
        return n_ruote;
    }

    public void setN_ruote(Integer n_ruote) {
        this.n_ruote = n_ruote;
    }

    public String getCarburante() { // Aggiornato
        return carburante;
    }

    public void setCarburante(String carburante) { // Aggiornato
        this.carburante = carburante;
    }

    @Override
    public String toString() {
        return "Automezzo ---> n_ruote= " + n_ruote + ", carburante= " + carburante;
    }

    public abstract int getMaxSpeed();
}