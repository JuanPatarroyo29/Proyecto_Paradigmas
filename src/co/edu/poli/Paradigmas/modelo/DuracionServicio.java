package co.edu.poli.Paradigmas.modelo;

public class DuracionServicio {
    private String descripcion;
    private String medidaTiempo;

    public DuracionServicio(String descripcion, String medidaTiempo){
        this.descripcion = descripcion;
        this.medidaTiempo = medidaTiempo;

    }


    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    
    public String getMedidaTiempo() {return medidaTiempo;}
    public void setMedidaTiempo(String medidaTiempo) {this.medidaTiempo = medidaTiempo;}


    @Override
    public String toString() {
        return "DuracionServicio [descripcion=" + descripcion + ", medidaTiempo=" + medidaTiempo + "]";
    }

    
}
