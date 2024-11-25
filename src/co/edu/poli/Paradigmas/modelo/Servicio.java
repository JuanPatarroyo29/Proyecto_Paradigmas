package co.edu.poli.Paradigmas.modelo;



/**
 * 
 */
public abstract class Servicio {

    private String id;
    private String nombre;
    protected DuracionServicio duracionServicio;
    protected CostoServicio costoServicio;

    /**
     * Default constructor
     */
    public Servicio(String id, String nombre, CostoServicio costoServicio) {
        this.id = id;
        this.nombre = nombre;
    }

    
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public DuracionServicio getDuracion() {return duracionServicio;}
    public void setDuracion(DuracionServicio duracionServicio) {this.duracionServicio = duracionServicio;}

    public CostoServicio getCostoServicio() {return costoServicio;}
    public void setCostoServicio(CostoServicio costoServicio) {this.costoServicio = costoServicio;}


    

    //metodo abstracto a implementar
    public abstract  void calcularCosto();


    @Override
    public String toString() {
        return "Servicio [id=" + id + ", nombre=" + nombre + ", duracion=" + duracionServicio + ", costo=" + costoServicio + "]";
    }


    /**
     * @return
     */
    public double calcularDuracion() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * 
     */
    public void mostrarDetalles() {
        // TODO implement here
    }



}