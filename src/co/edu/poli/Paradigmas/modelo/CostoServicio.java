package co.edu.poli.Paradigmas.modelo;

public class CostoServicio {
    private String moneda;
    private double cantidad;

    public CostoServicio(String moneda, double cantidad){
        this.moneda = moneda;
        this.cantidad = cantidad;

    }

    public String getMoneda() {return moneda;}
    public void setMoneda(String moneda) {this.moneda = moneda;}

    public double getCantidad() {return cantidad;}
    public void setCantidad(double cantidad) {this.cantidad = cantidad;}

    @Override
    public String toString() {
        return "CostoServicio [moneda=" + moneda + ", cantidad=" + cantidad + "]";
    }


    

}
