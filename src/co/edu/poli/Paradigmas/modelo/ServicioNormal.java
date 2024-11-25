package co.edu.poli.Paradigmas.modelo;




public class ServicioNormal extends Servicio {
    private String descripcion;

  
    public ServicioNormal(String id, String nombre, String descrpcion, double duracion, CostoServicio costoServicio, double costoAdicional) {
        super(id, nombre, costoServicio);
    }





    public String getDescripcion() {return descripcion;}   
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    @Override
    public void calcularCosto() {
        // TODO Auto-generated method stub
        
    }

 

}