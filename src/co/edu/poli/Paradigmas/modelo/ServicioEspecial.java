package co.edu.poli.Paradigmas.modelo;

/**
 * 
 */
public class ServicioEspecial extends Servicio {
    private  CostoServicio costoServicio;
    private double cantidadAdicional;
   
    public ServicioEspecial(String id, String nombre, CostoServicio costoServicio, double cantidadAdicional) {
        super (id, nombre, costoServicio);
        this.cantidadAdicional = cantidadAdicional;
    }
    
    @Override
    public CostoServicio getCostoServicio() {
        return costoServicio;
    }

    @Override
    public void setCostoServicio(CostoServicio costoServicio) {
        this.costoServicio = costoServicio;
    }

    public double getCostoAdicional() {
        return cantidadAdicional;
    }

    public void setCatidadAdicional(double cantidadAdicional) {
        this.cantidadAdicional = cantidadAdicional;
    }

    
    

    /**
     * @return
     */
    @Override
    public void calcularCosto() {
        
    }

    @Override
    public String toString() {
        return "ServicioEspecial [costoAdicional =" + cantidadAdicional + "]";
    }


}